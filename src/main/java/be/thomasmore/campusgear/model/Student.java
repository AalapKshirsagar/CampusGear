package be.thomasmore.campusgear.model;

import jakarta.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String naam;
    private String email;
    private String password;

    @ManyToOne
    private Campus campus;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getNaam() { return naam; }
    public void setNaam(String naam) { this.naam = naam; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public Campus getCampus() { return campus; }
    public void setCampus(Campus campus) { this.campus = campus; }
}