package kodlamaio.hrms.dataAccess.cvDao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kodlamaio.hrms.entities.cvEntities.ProjectInfo;

import java.util.List;

@Repository
public interface ProjectInfoDao extends JpaRepository<ProjectInfo, Long> {
    List<ProjectInfo> findAllByCandidateId( Long candidateId);
}
