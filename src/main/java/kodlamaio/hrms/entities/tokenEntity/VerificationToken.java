package kodlamaio.hrms.entities.tokenEntity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="tokens")
@NoArgsConstructor
@AllArgsConstructor
public
class VerificationToken {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id",nullable = false)
    private Long id;
    @Column(name="email",nullable = false)
    private String email;
    @Column(name="token",nullable = false,unique = true)
    private String token;
}
