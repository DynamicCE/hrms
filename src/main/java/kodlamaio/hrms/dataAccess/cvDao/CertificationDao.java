package kodlamaio.hrms.dataAccess.cvDao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kodlamaio.hrms.entities.cvEntities.Certification;

@Repository
public interface CertificationDao extends JpaRepository<Certification, Integer> {
}
