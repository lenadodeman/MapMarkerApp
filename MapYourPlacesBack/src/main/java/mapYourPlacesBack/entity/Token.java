package mapYourPlacesBack.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.ZonedDateTime;

@Data
@Entity
@Table(name = "TOKEN")
public class Token {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TOKEN_SEQ")
    @SequenceGenerator(name = "TOKEN_SEQ", sequenceName = "TOKEN_SEQ", allocationSize = 1)
    @Column(name = "id")
    private Long id;

    @Column(name = "modify_right")
    private boolean modifyRights;

    @Column(name = "creation_date")
    private ZonedDateTime creationDate;

    @Column(name = "expiration_date")
    private ZonedDateTime expirationDate;

    @Column(name = "creator_id")
    private Long creatorId;

    @Column(name = "tag_id")
    private Long tagId;

    @Column(name = "localisation_id")
    private Long localisationId;

    @Override
    public String toString() {
        return "Token{" +
                "id=" + id +
                ", modifyRights=" + modifyRights +
                ", creationDate=" + creationDate +
                ", expirationDate=" + expirationDate +
                ", creatorId=" + creatorId +
                ", tagId=" + tagId +
                ", locationId=" + localisationId +
                '}';
    }


}
