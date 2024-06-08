package kodlamaio.hrms.business.services.cv.abstracts;

import kodlamaio.hrms.core.result.DataResult;
import kodlamaio.hrms.entities.cvEntities.LanguageInfo;
import kodlamaio.hrms.entities.dtos.cvDtos.ExperienceInfoDto;
import kodlamaio.hrms.entities.dtos.cvDtos.LanguageInfoDto;

import java.util.List;

public interface LanguageInfoService {
    DataResult<List<LanguageInfo>> getAllByCandidateId(Long candidateId);
    DataResult<LanguageInfo> add(LanguageInfo languageInfo);
    DataResult<LanguageInfo> update(LanguageInfo languageInfo);
    DataResult<Void> delete(Long id);
    DataResult<List<LanguageInfoDto>> getAllDtosByCandidateId( Long candidateId);

}