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
@Table(name = "certifications")
public class CertificationInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "institution")
    private String institution;

    @Column(name = "issue_date")
    private String issueDate;

    @ManyToOne
    @JoinColumn(name = "candidate_id")
    private Candidate candidate;
}