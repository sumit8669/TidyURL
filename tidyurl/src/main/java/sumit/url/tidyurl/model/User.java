package sumit.url.tidyurl.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "email")
    private String email;

    private String username;
    private String password;
    private String role = "ROLE_USER";
}
