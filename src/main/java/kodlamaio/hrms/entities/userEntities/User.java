package kodlamaio.hrms.entities.userEntities;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "users")
public 
class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @OneToOne(mappedBy = "user")
    private Candidate candidates;

    @OneToOne(mappedBy = "user")
    private Employer employer;

    @OneToOne(mappedBy = "user")
    private Employee employee;

};
