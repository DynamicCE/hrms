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
class JobPost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")

    private long id;

    @ManyToOne()
    @JoinColumn(name="employer_id", nullable = false)
    private
    Employer employer;

    @Column(name = "job_title")
    private String jobTitle;

    @Column(name="description")
    private String description;

    @Column(name="city")
    private String city;

    @Column(name="min_salary ")
    private double minSalary;

    @Column(name="max_salary")
    private double maxSalary;

    @Column(name="num_of_positions")
    private int numOfPositions;

    @Column(name="application_deadline")
    private LocalDate applicationDeadline;

    @Column(name = "posted_date", nullable = false)
    private LocalDate postedDate = LocalDate.now();

    @Column(name="is_active")
    private boolean isActive;


}
