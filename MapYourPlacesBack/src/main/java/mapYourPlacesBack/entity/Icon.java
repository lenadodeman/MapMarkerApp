package mapYourPlacesBack.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(name = "ICON")
public class Icon {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ICON_SEQ")
    @SequenceGenerator(name = "ICON_SEQ", sequenceName = "ICON_SEQ", allocationSize = 1)
    @Column(name = "id")
    private Long id;

    @Size(min = 1, max = 255)
    @Column(name = "unicode")
    private String icon;

    @Override
    public String toString() {
        return "Icon{" +
                "id=" + id +
                ", icon='" + icon + '\'' +
                '}';
    }

}
