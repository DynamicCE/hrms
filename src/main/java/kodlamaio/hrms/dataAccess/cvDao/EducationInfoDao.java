package kodlamaio.hrms.dataAccess.cvDao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kodlamaio.hrms.entities.cvEntities.EducationInfo;

import java.util.List;

@Repository
public interface EducationInfoDao extends JpaRepository<EducationInfo, Long> {
    List<EducationInfo> findAllByCandidateIdOrderByGraduationYearDesc( Long candidateId);
    EducationInfo findByCandidateId(Long candidateId);
}
