package be.thomasmore.campusgear.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Campus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String naam;
    private String city;

    @OneToMany(mappedBy = "campus", fetch = FetchType.LAZY)
    private List<Item> items;

    @OneToMany(mappedBy = "campus", fetch = FetchType.LAZY)
    private List<Student> studenten;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getNaam() { return naam; }
    public void setNaam(String naam) { this.naam = naam; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public List<Item> getItems() { return items; }
    public void setItems(List<Item> items) { this.items = items; }

    public List<Student> getStudenten() { return studenten; }
    public void setStudenten(List<Student> studenten) {
        this.studenten = studenten;
    }
}