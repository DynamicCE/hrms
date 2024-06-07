package kodlamaio.hrms.dataAccess.cvDao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kodlamaio.hrms.entities.cvEntities.LanguageInfo;

import java.util.List;

@Repository
public interface LanguageInfoDao extends JpaRepository<LanguageInfo, Long> {
    List<LanguageInfo> findAllByCandidateId( Long candidateId);
}
