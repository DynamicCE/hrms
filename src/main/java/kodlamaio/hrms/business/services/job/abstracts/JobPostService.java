package kodlamaio.hrms.business.services.job.abstracts;

import kodlamaio.hrms.core.DataResult;
import kodlamaio.hrms.core.Result;
import kodlamaio.hrms.entities.jobEntities.JobPost;

import java.time.LocalDate;
import java.util.List;

public interface JobPostService {
 Result add(JobPost jobPost);
 DataResult<List<JobPost>> getAll();
 Result delete(JobPost jobPost);
 DataResult<List<JobPost>> findByIsActive(Boolean isActive);
 DataResult<List<JobPost>> findByIsActiveOrderByApplicationDeadline(Boolean isActive);
 DataResult<List<JobPost>> getAllActiveByEmployer(Long employerId);
 Result activateJobPost(Long jobId);
 Result deactivateJobPost(Long jobId);
 DataResult<List<JobPost>> findByApplicationDeadlineAfter(LocalDate date);

}
