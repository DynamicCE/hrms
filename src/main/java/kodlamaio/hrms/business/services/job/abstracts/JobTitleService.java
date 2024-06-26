package kodlamaio.hrms.business.services.job.abstracts;

import kodlamaio.hrms.core.result.DataResult;
import kodlamaio.hrms.core.result.Result;
import kodlamaio.hrms.entities.jobEntities.JobTitle;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public
interface JobTitleService {
    Result add( JobTitle jobTitle);
    DataResult<List<JobTitle>> getAll();
    Result delete(JobTitle jobTitle);

}
