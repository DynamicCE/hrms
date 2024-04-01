package kodlamaio.hrms.dataAccess.confirmation.abstracts;

import kodlamaio.hrms.entities.confirmationEntities.EmployeeConfirms;
import org.springframework.data.jpa.repository.JpaRepository;

public
interface EmployeeConfirmsDao extends JpaRepository<EmployeeConfirms,Integer> {
}
