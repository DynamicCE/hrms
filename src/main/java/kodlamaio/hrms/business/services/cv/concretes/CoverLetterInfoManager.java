package kodlamaio.hrms.business.services.cv.concretes;

import kodlamaio.hrms.dataAccess.cvDao.CoverLetterInfoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.services.cv.abstracts.CoverLetterInfoService;

@Service
public class CoverLetterInfoManager implements CoverLetterInfoService {
    private
    CoverLetterInfoDao coverLetterInfoDao;
    @Autowired
    public
    CoverLetterInfoManager ( CoverLetterInfoDao coverLetterInfoDao ) {
        this.coverLetterInfoDao = coverLetterInfoDao;
    }
}
