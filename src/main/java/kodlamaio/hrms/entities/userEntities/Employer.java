package kodlamaio.hrms.entities.userEntities;

import jakarta.persistence.*;
import kodlamaio.hrms.entities.jobEntities.JobPosts;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "employers")  
public
class Employer extends User {

    @Column(name = "company_name")
    private String companyName;
    @Column(name = "website")
    private String website;
    @Column(name = "phone_number")
    private String phoneNumber;

    @OneToOne()
    @JoinColumn(name="user_id")
    private User user;

    @OneToMany(mappedBy = "employer")
    private
    List<JobPosts> jobPosts;
}
