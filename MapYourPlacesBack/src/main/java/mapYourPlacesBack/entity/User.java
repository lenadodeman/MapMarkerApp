package mapYourPlacesBack.entity;

import jakarta.persistence.*;
import lombok.Data;
import jakarta.validation.constraints.Size;


@Entity
@Data
@Table(name = "USERS")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USERS_SEQ")
    @SequenceGenerator(name = "USERS_SEQ", sequenceName = "USERS_SEQ", allocationSize = 1)
    @Column(name = "id")
    private Long id;


    @Size(min = 1, max = 255)
    @Column(name = "username")
    private String username;


    @Size(min = 1, max = 255)
    @Column(name = "email")
    private String email;

    @Size(min = 1, max = 255)
    @Column(name = "password")
    private String password;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

}
