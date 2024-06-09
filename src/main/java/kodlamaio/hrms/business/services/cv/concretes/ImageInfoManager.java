package kodlamaio.hrms.business.services.cv.concretes;

import kodlamaio.hrms.business.services.cv.abstracts.ImageInfoService;
import kodlamaio.hrms.core.result.DataResult;
import kodlamaio.hrms.core.result.SuccessDataResult;
import kodlamaio.hrms.dataAccess.cvDao.ImageInfoDao;
import kodlamaio.hrms.entities.cvEntities.ImageInfo;
import kodlamaio.hrms.entities.dtos.cvDtos.ImageInfoDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ImageInfoManager implements ImageInfoService {

    private final ImageInfoDao imageInfoDao;
    private final ModelMapper modelMapper;
    @Autowired
    public ImageInfoManager( ImageInfoDao imageInfoDao, ModelMapper modelMapper ) {
        this.imageInfoDao = imageInfoDao;
        this.modelMapper = modelMapper;
    }

    @Override
    public DataResult<List<ImageInfo>> getAllByCandidateId(Long candidateId) {
        List<ImageInfo> result = imageInfoDao.findAllByCandidateId(candidateId);
        return new SuccessDataResult<>(result, "Adayın resim bilgileri başarıyla getirildi.");
    }

    @Override
    public DataResult<ImageInfo> add(ImageInfo imageInfo) {
        ImageInfo result = imageInfoDao.save(imageInfo);
        return new SuccessDataResult<>(result, "Resim bilgisi başarıyla eklendi.");
    }

    @Override
    public DataResult<ImageInfo> update(ImageInfo imageInfo) {
        ImageInfo result = imageInfoDao.save(imageInfo);
        return new SuccessDataResult<>(result, "Resim bilgisi başarıyla güncellendi.");
    }

    @Override
    public DataResult<Void> delete(Long id) {
        imageInfoDao.deleteById(id);
        return new SuccessDataResult<>(null, "Resim bilgisi başarıyla silindi.");
    }

    @Override
    public
    DataResult<ImageInfoDto> getDtoByCandidateId ( Long candidateId ) {
        return null;
    }

    @Override
    public DataResult<List<ImageInfoDto>> getAllDtosByCandidateId(Long candidateId) {
        List<ImageInfo> imageInfos = imageInfoDao.findAllByCandidateId(candidateId);
        List<ImageInfoDto> imageInfoDtos = imageInfos.stream()
                .map(imageInfo -> modelMapper.map(imageInfo, ImageInfoDto.class))
                .collect( Collectors.toList());
        return new SuccessDataResult<>(imageInfoDtos, "Image infos listed successfully");
    }

}