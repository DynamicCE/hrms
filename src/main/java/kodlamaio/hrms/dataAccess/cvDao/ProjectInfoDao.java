package kodlamaio.hrms.dataAccess.cvDao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kodlamaio.hrms.entities.cvEntities.ProjectInfo;

@Repository
public interface ProjectInfoDao extends JpaRepository<ProjectInfo, Long> {
}
