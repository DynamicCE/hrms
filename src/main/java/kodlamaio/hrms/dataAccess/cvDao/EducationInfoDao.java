package kodlamaio.hrms.dataAccess.cvDao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kodlamaio.hrms.entities.cvEntities.EducationInfo;

@Repository
public interface EducationInfoDao extends JpaRepository<EducationInfo, Integer> {
}
