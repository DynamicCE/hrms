package kodlamaio.hrms.business.services.cv.concretes;

import kodlamaio.hrms.dataAccess.cvDao.LanguageDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.services.cv.abstracts.LanguageService;

@Service
public class LanguageManager implements LanguageService {
    private
    LanguageDao languageDao;
    @Autowired

    public
    LanguageManager ( LanguageDao languageDao ) {
        this.languageDao = languageDao;
    }
}
