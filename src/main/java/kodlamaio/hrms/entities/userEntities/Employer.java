package kodlamaio.hrms.entities.userEntities;

import jakarta.persistence.*;
import kodlamaio.hrms.entities.jobEntities.JobPost;
import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;

import java.util.List;


@Data
@Entity
@Table(name = "employers")
@NoArgsConstructor
@AllArgsConstructor
public class Employer extends User {

    @Column(name = "company_name",nullable = false)
    private String companyName;

    @Column(name = "website",nullable = false)
    private String website;

    @Column(name = "phone_number",nullable = false)
    private String phoneNumber;

    @Column(name="approval_status",nullable = false)
    private String approvalStatus = "PENDING";

    @OneToMany(mappedBy = "employer")
    private List<JobPost> jobPosts;
}
