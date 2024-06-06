package kodlamaio.hrms.business.services.cv.abstracts;

import kodlamaio.hrms.core.result.DataResult;
import kodlamaio.hrms.core.result.Result;
import kodlamaio.hrms.entities.cvEntities.ExperienceInfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public
interface ExperienceInfoService  {
    Result add ( ExperienceInfo experienceInfo );

    DataResult<List<ExperienceInfo>> getAll ();
}
