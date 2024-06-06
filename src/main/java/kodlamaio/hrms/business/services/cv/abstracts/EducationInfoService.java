package kodlamaio.hrms.business.services.cv.abstracts;

import kodlamaio.hrms.core.DataResult;
import kodlamaio.hrms.core.Result;
import kodlamaio.hrms.entities.cvEntities.EducationInfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public
interface EducationInfoService {
    Result add ( EducationInfo educationInfo );
    DataResult<List<EducationInfo>> getAllByCandidateId( Long candidateId);
}