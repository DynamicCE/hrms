package kodlamaio.hrms.business.services.job.abstracts;

import kodlamaio.hrms.core.DataResult;
import kodlamaio.hrms.core.Result;
import kodlamaio.hrms.dataAccess.job.abstracts.JobPostDao;
import kodlamaio.hrms.entities.jobEntities.JobPost;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public
interface JobPostService {
 Result add ( JobPost jobPost);
 DataResult<List<JobPost>> getAll();
 Result delete (JobPost jobPost);
 DataResult<List<JobPost>> findByIsActive(Boolean isActive);
 DataResult<List<JobPost>> findByIsActiveOrderByApplicationDeadline( Boolean isActive );
}
