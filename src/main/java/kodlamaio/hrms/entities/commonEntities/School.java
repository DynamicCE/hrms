package kodlamaio.hrms.entities.commonEntities;

import jakarta.persistence.*;
import kodlamaio.hrms.entities.userEntities.Candidate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "schools")
@NoArgsConstructor
@AllArgsConstructor
public
class School {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "school_name", nullable = false)
    private String schoolName;

    @Column(name = "department", nullable = false)
    private String department;

    @Column(name = "start_year", nullable = false)
    private int startYear;

    @Column(name = "graduation_year")
    private Integer graduationYear; // Nullable

    @ManyToOne
    @JoinColumn(name = "candidate_id", nullable = false)
    private Candidate candidate;

}
