package kodlamaio.hrms.entities.userEntities;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "users")
public abstract
class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    
}
