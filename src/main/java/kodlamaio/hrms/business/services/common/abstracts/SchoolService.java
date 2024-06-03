package kodlamaio.hrms.business.services.common.abstracts;

import kodlamaio.hrms.core.DataResult;
import kodlamaio.hrms.core.Result;
import kodlamaio.hrms.entities.commonEntities.School;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public
interface SchoolService {
    Result addSchool( School school);
    DataResult<List<School>> getSchoolsByCandidate( Long candidateId);
}
