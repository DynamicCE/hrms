package kodlamaio.hrms.business.services.cv.concretes;

import kodlamaio.hrms.core.DataResult;
import kodlamaio.hrms.core.Result;
import kodlamaio.hrms.core.SuccessDataResult;
import kodlamaio.hrms.dataAccess.cvDao.ExperinceInfoDao;
import kodlamaio.hrms.entities.cvEntities.ExperienceInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.services.cv.abstracts.ExperienceInfoService;

import java.util.List;

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

    @Override
    public
    Result add ( ExperienceInfo experienceInfo ) {
        return new SuccessDataResult<> ( experinceInfoDao.save ( experienceInfo ),"tecrübe bilgileri eklendi" );
    }

    @Override
    public
    DataResult<List<ExperienceInfo>> getAll () {
        return new SuccessDataResult<> ( experinceInfoDao.findAll (),"iş tecrübeleri getirildi" );
    }
}
