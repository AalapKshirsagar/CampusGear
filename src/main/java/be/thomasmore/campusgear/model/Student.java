package be.thomasmore.campusgear.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String naam;
    private String email;
    private String password;

    @ManyToOne(fetch = FetchType.LAZY)
    private Campus campus;

    @OneToMany(mappedBy = "student", fetch = FetchType.LAZY)
    private List<Reservation> reservations;

    @ManyToMany(fetch = FetchType.LAZY)
    private List<Item> favorieten;

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

    public List<Reservation> getReservations() { return reservations; }
    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    public List<Item> getFavorieten() { return favorieten; }
    public void setFavorieten(List<Item> favorieten) {
        this.favorieten = favorieten;
    }
}