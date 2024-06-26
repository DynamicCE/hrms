package kodlamaio.hrms.business.services.cv.abstracts;

import kodlamaio.hrms.core.result.DataResult;
import kodlamaio.hrms.entities.cvEntities.CoverLetterInfo;
import kodlamaio.hrms.entities.dtos.cvDtos.CertificationInfoDto;
import kodlamaio.hrms.entities.dtos.cvDtos.CoverLetterInfoDto;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface CoverLetterInfoService {
    DataResult<List<CoverLetterInfo>> getAll();
    DataResult<CoverLetterInfo> add(CoverLetterInfo coverLetterInfo);
    DataResult<CoverLetterInfo> update(CoverLetterInfo coverLetterInfo);
    DataResult<Void> delete(Long id);
    DataResult<List<CoverLetterInfoDto>> getAllDtosByCandidateId( Long candidateId);
}