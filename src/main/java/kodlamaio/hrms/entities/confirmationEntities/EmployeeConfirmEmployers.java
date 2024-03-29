package kodlamaio.hrms.entities.confirmationEntities;

import jakarta.persistence.*;
import kodlamaio.hrms.entities.userEntities.Employee;
import kodlamaio.hrms.entities.userEntities.Employer;
import lombok.Data;

@Table(name = "employee_confirms_employer")
@Data
public
class EmployeeConfirmEmployers {
    @Id
    @Column(name = "id")
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employer_id" ,referencedColumnName = "employer_id")
    private Employer employer;

    @Column(name = "is_confirmed")
    private boolean isConfirmed;

    @Column(name = "created_at")
    private String createdAt;
}
