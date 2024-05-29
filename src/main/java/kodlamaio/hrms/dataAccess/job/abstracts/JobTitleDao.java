package kodlamaio.hrms.dataAccess.job.abstracts;

import kodlamaio.hrms.entities.jobEntities.JobTitle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public
interface JobTitleDao extends JpaRepository<JobTitle,Integer> {
    boolean existsByJobTitle( String jobTitle);
}
