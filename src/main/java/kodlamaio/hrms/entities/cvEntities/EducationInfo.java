package kodlamaio.hrms.entities.cvEntities;

import jakarta.persistence.*;
import kodlamaio.hrms.entities.userEntities.Candidate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "education_infos")
public class EducationInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "school_name", nullable = false)
    private String schoolName;

    @Column(name = "department", nullable = false)
    private String department;

    @Column(name = "start_year", nullable = false)
    private int startYear;

    @Column(name = "graduation_year")
    private Integer graduationYear;

    @ManyToOne
    @JoinColumn(name = "candidate_id", nullable = false)
    private Candidate candidate;

    @Transient
    private String schoolStatus;
}
