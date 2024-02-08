package mapYourPlacesBack.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "TAG")
public class Tag {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TAG_SEQ")
    @SequenceGenerator(name = "TAG_SEQ", sequenceName = "TAG_SEQ", allocationSize = 1)
    @Column(name = "id")
    private Long id;

    @Size(min = 1, max = 255)
    @Column(name = "label")
    private String label;

    @ElementCollection
    @CollectionTable(name = "LOCALISATION_TAG", joinColumns = @JoinColumn(name = "tag_id"))
    @Column(name = "localisation_id")
    private List<Long> localisationsIds;


    @Override
    public String toString() {
        return "Tag{" +
                "id=" + id +
                ", label='" + label + '\'' +
                ", localisationIds=" + localisationsIds +
                '}';
    }
}
