package kodlamaio.hrms.dataAccess.cvDao;

import kodlamaio.hrms.entities.cvEntities.Talent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public
interface TalentDao extends  JpaRepository<Talent, Integer>{
}
