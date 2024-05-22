package kodlamaio.hrms.dataAccess.job.abstracts;

import kodlamaio.hrms.entities.jobEntities.JobTitles;
import org.springframework.data.jpa.repository.JpaRepository;

public
interface JobTitlesDao extends JpaRepository<JobTitles,Integer> {
}
