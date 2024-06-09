package kodlamaio.hrms.dataAccess.confirmation.abstracts;

import kodlamaio.hrms.entities.confirmationEntities.EmployeeConfirmEmployers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public
interface EmployeeConfirmEmployersDao extends JpaRepository<EmployeeConfirmEmployers,Integer> {
}
