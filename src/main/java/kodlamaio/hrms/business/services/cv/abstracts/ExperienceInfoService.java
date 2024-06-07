package kodlamaio.hrms.business.services.cv.abstracts;

import kodlamaio.hrms.core.result.DataResult;
import kodlamaio.hrms.entities.cvEntities.ExperienceInfo;

import java.util.List;

public interface ExperienceInfoService {
    DataResult<List<ExperienceInfo>> getAllByCandidateId(Long candidateId);
    DataResult<ExperienceInfo> add(ExperienceInfo experienceInfo);
    DataResult<ExperienceInfo> update(ExperienceInfo experienceInfo);
    DataResult<Void> delete(Long id);
    DataResult<List<ExperienceInfo>> getAllByCandidateIdOrderByEndYearDesc(Long candidateId);
}