package kodlamaio.hrms.entities.userEntities;

import jakarta.persistence.*;
import kodlamaio.hrms.entities.jobEntities.JobPost;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "employers")
public class Employer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "website")
    private String website;

    @Column(name = "phone_number")
    private String phoneNumber;

//    @OneToOne
//    @JoinColumn(name = "user_id")
//    private User user;

    @OneToMany(mappedBy = "employer")
    private List<JobPost> jobPosts;
}
