package mapYourPlacesBack.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "LOCALISATION")
public class Localisation {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LOCALISATION_SEQ")
    @SequenceGenerator(name = "LOCALISATION_SEQ", sequenceName = "LOCALISATION_SEQ", allocationSize = 1)
    @Column(name = "id")
    private Long id;

    @Size(min = 1, max = 255)
    @Column(name = "name")
    private String name;

    @Size(min = 1, max = 255)
    @Column(name = "description")
    private String description;

    @Column(name = "longitude")
    private Double longitude;

    @Column(name = "latitude")
    private Double latitude;

    @Column(name = "icon_id")
    private Long iconId;

    @Column(name = "user_id")
    private Long creatorId;

    @ElementCollection
    @CollectionTable(name = "LOCALISATION_TAG", joinColumns = @JoinColumn(name = "localisation_id"))
    @Column(name = "tag_id")
    private List<Long> tagsIds;

    @Override
    public String toString() {
        return "Localisation{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                ", iconId=" + iconId +
                ", creatorId=" + creatorId +
                ", tagsIds=" + tagsIds +
                '}';
    }
}
