package kodlamaio.hrms.dataAccess.user.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository; // Eksik anotasyon

import kodlamaio.hrms.entities.userEntities.Employer;

@Repository 
public interface EmployerDao extends JpaRepository<Employer, Long>{
    boolean existsByEmail(String email);
    boolean existsByPhoneNumber(String phoneNumber);
}
