package kodlamaio.hrms.business.services.cv.abstracts;

import kodlamaio.hrms.core.result.DataResult;
import kodlamaio.hrms.entities.cvEntities.Talent;
import kodlamaio.hrms.entities.dtos.cvDtos.TalentInfoDto;

import java.util.List;

public interface TalentInfoService {
    DataResult<List<Talent>> getAllByCandidateId( Long candidateId);
    DataResult<Talent> add( Talent talentInfo);
    DataResult<Talent> update( Talent talentInfo);
    DataResult<Void> delete(Long id);
    DataResult<List<TalentInfoDto>> getAllDtosByCandidateId( Long candidateId);

}