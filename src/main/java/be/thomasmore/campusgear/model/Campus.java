package be.thomasmore.campusgear.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Campus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String naam;
    private String city;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getNaam() { return naam; }
    public void setNaam(String naam) { this.naam = naam; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }
}