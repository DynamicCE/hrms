package kodlamaio.hrms.dataAccess.cvDao;

import kodlamaio.hrms.entities.cvEntities.Talent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TalentInfoDao extends JpaRepository<Talent, Long> {
    List<Talent> findAllByCandidateId( Long candidateId);
}