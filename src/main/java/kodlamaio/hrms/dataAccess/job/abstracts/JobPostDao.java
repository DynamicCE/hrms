package kodlamaio.hrms.dataAccess.job.abstracts;

import kodlamaio.hrms.entities.jobEntities.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;

public
interface JobPostDao extends JpaRepository<JobPost,Integer> {
}
