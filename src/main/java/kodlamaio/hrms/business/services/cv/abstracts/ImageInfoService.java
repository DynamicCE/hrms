package kodlamaio.hrms.business.services.cv.abstracts;

import kodlamaio.hrms.core.result.DataResult;
import kodlamaio.hrms.entities.cvEntities.ImageInfo;
import kodlamaio.hrms.entities.dtos.cvDtos.ImageInfoDto;

import java.util.List;

public interface ImageInfoService {
    DataResult<List<ImageInfo>> getAllByCandidateId(Long candidateId);
    DataResult<ImageInfo> add(ImageInfo imageInfo);
    DataResult<ImageInfo> update(ImageInfo imageInfo);
    DataResult<Void> delete(Long id);
    DataResult<ImageInfoDto> getDtoByCandidateId( Long candidateId);

}