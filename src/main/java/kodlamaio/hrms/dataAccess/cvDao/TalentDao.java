package kodlamaio.hrms.dataAccess.cvDao;

import kodlamaio.hrms.entities.cvEntities.Talent;
import org.springframework.data.jpa.repository.JpaRepository;

public
interface TalentDao extends JpaRepository<Talent,Long> {
}
