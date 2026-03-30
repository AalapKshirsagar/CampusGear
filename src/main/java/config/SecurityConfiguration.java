package be.thomasmore.campusgear.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import javax.sql.DataSource;

import static org.springframework.boot.autoconfigure.security.servlet.PathRequest.toH2Console;
import static org.springframework.security.config.Customizer.withDefaults;

@EnableWebSecurity
@Configuration
public class SecurityConfiguration {

    @Value(value = "${security.h2-console-needed:true}")
    private boolean h2ConsoleNeeded;

    private final DataSource dataSource;

    public SecurityConfiguration(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Bean
    public JdbcUserDetailsManager jdbcUserDetailsManager() {
        return new JdbcUserDetailsManager(dataSource);
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(auth -> auth
                .requestMatchers("/admin/**").hasAuthority("ADMIN")
                .anyRequest().permitAll());

        http.formLogin(form -> form.loginPage("/login"));
        http.logout(form -> form.logoutUrl("/logout"));

        if (h2ConsoleNeeded) {
            http.csrf(csrf -> csrf.ignoringRequestMatchers(toH2Console()));
            http.headers(headers ->
                    headers.frameOptions(
                            org.springframework.security.config.annotation.web.configurers
                                    .HeadersConfigurer.FrameOptionsConfig::sameOrigin));
        }

        return http.build();
    }
}