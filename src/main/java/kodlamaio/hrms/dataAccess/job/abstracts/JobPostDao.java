package kodlamaio.hrms.dataAccess.job.abstracts;

import kodlamaio.hrms.entities.jobEntities.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public
interface JobPostDao extends JpaRepository<JobPost,Integer> {
    List<JobPost> findByIsActive( Boolean isActive);
    List<JobPost> findByIsActiveOrderByApplicationDeadline( Boolean isActive );
    List<JobPost> findByEmployerIdAndIsActive()
}
