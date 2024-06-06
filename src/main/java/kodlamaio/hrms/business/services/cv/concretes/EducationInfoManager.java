package kodlamaio.hrms.business.services.cv.concretes;

import kodlamaio.hrms.core.result.DataResult;
import kodlamaio.hrms.core.result.Result;
import kodlamaio.hrms.core.result.SuccessDataResult;
import kodlamaio.hrms.core.result.SuccessResult;
import kodlamaio.hrms.dataAccess.cvDao.EducationInfoDao;
import kodlamaio.hrms.entities.cvEntities.EducationInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.services.cv.abstracts.EducationInfoService;

import java.util.List;

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

    @Override
    public
    Result add ( EducationInfo educationInfo ) {
        educationInfoDao.save ( educationInfo );
        return new SuccessResult ( "eğitim bilgisi başarıyla eklendi" );
    }

    @Override
    public
    DataResult<List<EducationInfo>> getAllByCandidateId ( Long candidateId ) {
        List<EducationInfo> educationInfos = educationInfoDao.findAllByCandidateIdOrderByGraduationYearDesc ( candidateId );
        for (EducationInfo info : educationInfos) {
            if (info.getGraduationYear ( ) == null) {
                info.setGraduationYear ( Integer.MAX_VALUE );
                info.setSchoolStatus ( "Devam Ediyor" );
            }
        }
        return new SuccessDataResult<> ( educationInfos, "Eğitim bilgileri getirildi" );
    }
}
