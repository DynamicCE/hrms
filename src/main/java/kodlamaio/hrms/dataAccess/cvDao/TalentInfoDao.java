package kodlamaio.hrms.dataAccess.cvDao;

import kodlamaio.hrms.entities.cvEntities.TalentInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public
interface TalentInfoDao extends JpaRepository<TalentInfo,Long> {
}
