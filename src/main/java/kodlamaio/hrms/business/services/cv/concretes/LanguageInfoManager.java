package kodlamaio.hrms.business.services.cv.concretes;

import kodlamaio.hrms.dataAccess.cvDao.LanguageInfoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.services.cv.abstracts.LanguageInfoService;

@Service
public class LanguageInfoManager implements LanguageInfoService {
    private
    LanguageInfoDao languageDao;
    @Autowired

    public
    LanguageInfoManager ( LanguageInfoDao languageDao ) {
        this.languageDao = languageDao;
    }
}
