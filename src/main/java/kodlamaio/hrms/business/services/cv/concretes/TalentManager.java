package kodlamaio.hrms.business.services.cv.concretes;

import kodlamaio.hrms.dataAccess.cvDao.TalentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.services.cv.abstracts.TalentService;

@Service
public class TalentManager implements TalentService {
    private
    TalentDao talentDao;
    @Autowired

    public
    TalentManager ( TalentDao talentDao ) {
        this.talentDao = talentDao;
    }
}
