package kodlamaio.hrms.dataAccess.cvDao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kodlamaio.hrms.entities.cvEntities.CertificationInfo;

@Repository
public interface CertificationInfoDao extends JpaRepository<CertificationInfo, Long> {
}
