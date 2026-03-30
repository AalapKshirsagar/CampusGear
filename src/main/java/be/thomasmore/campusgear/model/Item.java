package be.thomasmore.campusgear.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.util.List;

@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "Titel mag niet leeg zijn")
    private String title;

    @NotBlank(message = "Omschrijving mag niet leeg zijn")
    private String description;

    @NotBlank(message = "Categorie mag niet leeg zijn")
    private String category;

    @NotBlank(message = "Status mag niet leeg zijn")
    private String status;

    private String imageUrl;

    @NotBlank(message = "Eigenaar mag niet leeg zijn")
    private String ownerName;

    @ManyToOne(fetch = FetchType.LAZY)
    @NotNull(message = "Campus mag niet leeg zijn")
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