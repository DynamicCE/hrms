package kodlamaio.hrms.business.services.cv.abstracts;

import kodlamaio.hrms.core.result.DataResult;
import kodlamaio.hrms.entities.cvEntities.TalentInfo;
import kodlamaio.hrms.entities.dtos.cvDtos.ProjectInfoDto;
import kodlamaio.hrms.entities.dtos.cvDtos.TalentInfoDto;

import java.util.List;

public interface TalentInfoService {
    DataResult<List<TalentInfo>> getAllByCandidateId(Long candidateId);
    DataResult<TalentInfo> add(TalentInfo talentInfo);
    DataResult<TalentInfo> update(TalentInfo talentInfo);
    DataResult<Void> delete(Long id);
    DataResult<List<TalentInfoDto>> getAllDtosByCandidateId( Long candidateId);

}