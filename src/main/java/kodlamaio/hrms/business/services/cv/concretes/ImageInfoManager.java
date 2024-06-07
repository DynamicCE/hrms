package kodlamaio.hrms.business.services.cv.concretes;

import kodlamaio.hrms.business.services.cv.abstracts.ImageInfoService;
import kodlamaio.hrms.core.result.DataResult;
import kodlamaio.hrms.core.result.SuccessDataResult;
import kodlamaio.hrms.dataAccess.cvDao.ImageInfoDao;
import kodlamaio.hrms.entities.cvEntities.ImageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImageInfoManager implements ImageInfoService {

    private final ImageInfoDao imageInfoDao;

    @Autowired
    public ImageInfoManager(ImageInfoDao imageInfoDao) {
        this.imageInfoDao = imageInfoDao;
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
}