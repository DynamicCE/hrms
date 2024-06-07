package kodlamaio.hrms.dataAccess.cvDao;

import kodlamaio.hrms.entities.userEntities.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kodlamaio.hrms.entities.cvEntities.ExperienceInfo;

import java.util.List;

@Repository
public interface ExperienceInfoDao extends JpaRepository<ExperienceInfo, Long> {
    List<ExperienceInfo> findAllByCandidateIdOrderByEndYearDesc(Long candidateId);
    List<ExperienceInfo> findAllByCandidateId( Long candidateId );
}
