package kodlamaio.hrms.business.services.cv.concretes;

import kodlamaio.hrms.dataAccess.cvDao.ImageInfoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.services.cv.abstracts.ImageInfoService;

@Service
public class ImageInfoManager implements ImageInfoService {
    private
    ImageInfoDao imageInfoDao;

    @Autowired

    public
    ImageInfoManager ( ImageInfoDao imageInfoDao ) {
        this.imageInfoDao = imageInfoDao;
    }
}
