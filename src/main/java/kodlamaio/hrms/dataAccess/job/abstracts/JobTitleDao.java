package kodlamaio.hrms.dataAccess.job.abstracts;

import kodlamaio.hrms.entities.jobEntities.JobTitle;
import org.springframework.data.jpa.repository.JpaRepository;

public
interface JobTitleDao extends JpaRepository<JobTitle,Integer> {
    boolean existsByJobTitle(JobTitle jobTitle);
}
