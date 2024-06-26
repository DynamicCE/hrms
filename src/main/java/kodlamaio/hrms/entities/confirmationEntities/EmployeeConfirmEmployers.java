package kodlamaio.hrms.entities.confirmationEntities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import kodlamaio.hrms.entities.userEntities.Employer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "employee_confirms_employer")
@Data
@NoArgsConstructor
@AllArgsConstructor
public
class EmployeeConfirmEmployers {
    @Id
    @Column(name = "id")
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employer_id" ,referencedColumnName = "id")
    private Employer employer;

    @Column(name = "is_confirmed")
    private boolean isConfirmed;

    @Column(name = "created_at")
    private String createdAt;
}
