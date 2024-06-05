package kodlamaio.hrms.business.services.cv.concretes;

import kodlamaio.hrms.dataAccess.cvDao.CoverLetterDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.services.cv.abstracts.CoverLetterService;

@Service
public class CoverLetterManager implements CoverLetterService {
    private
    CoverLetterDao coverLetterDao;
    @Autowired
    public
    CoverLetterManager ( CoverLetterDao coverLetterDao ) {
        this.coverLetterDao = coverLetterDao;
    }
}
