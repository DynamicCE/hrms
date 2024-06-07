package kodlamaio.hrms.business.services.cv.abstracts;

import kodlamaio.hrms.core.result.DataResult;
import kodlamaio.hrms.entities.cvEntities.EducationInfo;

import java.util.List;

public interface EducationInfoService {
    DataResult<List<EducationInfo>> getAll();
    DataResult<EducationInfo> add(EducationInfo educationInfo);
    DataResult<EducationInfo> update(EducationInfo educationInfo);
    DataResult<Void> delete(Long id);
    DataResult<List<EducationInfo>> getAllByCandidateId(Long candidateId);
}