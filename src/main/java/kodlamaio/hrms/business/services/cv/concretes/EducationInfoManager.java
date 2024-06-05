package kodlamaio.hrms.business.services.cv.concretes;

import kodlamaio.hrms.dataAccess.cvDao.EducationInfoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.services.cv.abstracts.EducationInfoService;

@Service
public
class EducationInfoManager implements EducationInfoService {
    private
    EducationInfoDao educationInfoDao;

    @Autowired
    public
    EducationInfoManager ( EducationInfoDao educationInfoDao ) {
        this.educationInfoDao = educationInfoDao;
    }
}
