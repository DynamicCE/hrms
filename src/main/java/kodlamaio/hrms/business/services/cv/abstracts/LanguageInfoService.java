package kodlamaio.hrms.business.services.cv.abstracts;

import kodlamaio.hrms.core.result.DataResult;
import kodlamaio.hrms.entities.cvEntities.LanguageInfo;

import java.util.List;

public interface LanguageInfoService {
    DataResult<List<LanguageInfo>> getAllByCandidateId(Long candidateId);
    DataResult<LanguageInfo> add(LanguageInfo languageInfo);
    DataResult<LanguageInfo> update(LanguageInfo languageInfo);
    DataResult<Void> delete(Long id);
}