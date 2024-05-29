package kodlamaio.hrms.entities.userEntities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import kodlamaio.hrms.entities.jobEntities.JobPost;
import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;


@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "employers")
@NoArgsConstructor
@AllArgsConstructor
public class Employer extends User {

    @Column(name = "company_name",nullable = false)
    @NotBlank(message = "Şirket adı alanı boş bırakılamaz!")
    private String companyName;

    @Column(name = "website",nullable = false)
    @NotBlank(message = "Web adresi alanı boş bırakılamaz!")
    private String website;

    @Column(name = "phone_number",nullable = false)
    @NotBlank(message = "Telefon numarası alanı boş bırakılamaz!")
    private String phoneNumber;

    @Column(name="approval_status",nullable = false)
    private String approvalStatus = "PENDING";

    @OneToMany(mappedBy = "employer")
    private List<JobPost> jobPosts;
}
