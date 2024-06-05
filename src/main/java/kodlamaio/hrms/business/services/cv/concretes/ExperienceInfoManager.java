package kodlamaio.hrms.business.services.cv.concretes;

import kodlamaio.hrms.dataAccess.cvDao.ExperinceInfoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.services.cv.abstracts.ExperienceInfoService;

@Service
public
class ExperienceInfoManager implements ExperienceInfoService {
    private
    ExperinceInfoDao experinceInfoDao;

    @Autowired
    public
    ExperienceInfoManager ( ExperinceInfoDao experinceInfoDao ) {
        this.experinceInfoDao = experinceInfoDao;
    }
}
