package kodlamaio.hrms.dataAccess.cvDao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kodlamaio.hrms.entities.cvEntities.CoverLetterInfo;

import java.util.List;

@Repository
public interface CoverLetterInfoDao extends JpaRepository<CoverLetterInfo, Long> {
    List<CoverLetterInfo> findAllByCandidateId(Long candidateId);
}
