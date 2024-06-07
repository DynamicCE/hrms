package kodlamaio.hrms.dataAccess.cvDao;

import kodlamaio.hrms.entities.cvEntities.TalentInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TalentInfoDao extends JpaRepository<TalentInfo, Long> {
    List<TalentInfo> findAllByCandidateId(Long candidateId);
}