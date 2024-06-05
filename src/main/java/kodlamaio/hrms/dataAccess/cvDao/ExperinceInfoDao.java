package kodlamaio.hrms.dataAccess.cvDao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kodlamaio.hrms.entities.cvEntities.ExperienceInfo;

@Repository
public interface ExperinceInfoDao extends JpaRepository<ExperienceInfo, Long> {
}
