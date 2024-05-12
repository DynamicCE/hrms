package kodlamaio.hrms.entities.jobEntities;

import jakarta.persistence.*;
import kodlamaio.hrms.entities.userEntities.Employer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "job_posts")
public
class JobPosts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne()
    @JoinColumn(name="employer_id")
    private
    Employer employer;

    @Column(name = "job_title")
    private String jobTitle;

    @Column(name="description")
    private String description;

    @Column(name="city")
    private String city;

    @Column(name="salary_min ")
    private double salaryMin;

    @Column(name="salary_max")
    private double salaryMax;

    @Column(name="num_of_positions")
    private int numOfPositions;

    @Column(name="application_deadline")
    private LocalDate applicationDeadline;



}
