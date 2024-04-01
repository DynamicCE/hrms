package kodlamaio.hrms.dataAccess.confirmation.abstracts;

import kodlamaio.hrms.entities.confirmationEntities.EmployeeConfirmEmployers;
import org.springframework.data.jpa.repository.JpaRepository;

public
interface EmployeeConfirmEmployersDao extends JpaRepository<EmployeeConfirmEmployers,Integer> {
}
