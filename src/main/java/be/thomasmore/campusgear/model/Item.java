package be.thomasmore.campusgear.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;
    private String description;
    private String category;
    private String status;
    private String imageUrl;
    private String ownerName;

    @ManyToOne(fetch = FetchType.LAZY)
    private Campus campus;

    @OneToMany(mappedBy = "item", fetch = FetchType.LAZY)
    private List<Reservation> reservations;

    @ManyToMany(mappedBy = "favorieten", fetch = FetchType.LAZY)
    private List<Student> studenten;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getImageUrl() { return imageUrl; }
    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }

    public String getOwnerName() { return ownerName; }
    public void setOwnerName(String ownerName) { this.ownerName = ownerName; }

    public Campus getCampus() { return campus; }
    public void setCampus(Campus campus) { this.campus = campus; }

    public List<Reservation> getReservations() { return reservations; }
    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    public List<Student> getStudenten() { return studenten; }
    public void setStudenten(List<Student> studenten) {
        this.studenten = studenten;
    }
}