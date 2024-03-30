package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository; // Eksik anotasyon

import kodlamaio.hrms.entities.userEntities.Employer;

@Repository 
public interface EmployerDao extends JpaRepository<Employer, Integer>{

}
