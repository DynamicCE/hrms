package kodlamaio.hrms.entities.confirmationEntities;

import jakarta.persistence.*;
import kodlamaio.hrms.entities.userEntities.Employee;
import lombok.Data;

@Table(name = "employee_confirms")
@Data
public
class EmployeeConfirms {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id" ,referencedColumnName = "employee_id")
    private Employee employee;

    @Column(name = "is_confirmed")
    private boolean isConfirmed;

    @Column(name = "created_at")
    private String createdAt;


}
