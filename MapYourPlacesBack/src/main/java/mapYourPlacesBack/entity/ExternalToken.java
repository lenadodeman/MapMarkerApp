package mapYourPlacesBack.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(name = "EXTERNAL_TOKEN")
public class ExternalToken {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EXTERNAL_TOKEN_SEQ")
    @SequenceGenerator(name = "EXTERNAL_TOKEN_SEQ", sequenceName = "EXTERNAL_TOKEN_SEQ", allocationSize = 1)
    @Column(name = "id")
    private Long id;

    @Size(min = 1, max = 255)
    @Column(name = "url")
    private String url;

    @Size(min = 1, max = 255)
    @Column(name = "token")
    private String token;

    @Override
    public String toString() {
        return "SharedToken{" +
                "id=" + id +
                ", url='" + url + '\'' +
                ", sharedToken='" + token + '\'' +
                '}';
    }

}
