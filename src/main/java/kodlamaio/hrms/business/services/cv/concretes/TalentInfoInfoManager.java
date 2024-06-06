package kodlamaio.hrms.business.services.cv.concretes;

import kodlamaio.hrms.dataAccess.cvDao.TalentInfoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.services.cv.abstracts.TalentInfoService;

@Service
public class TalentInfoInfoManager implements TalentInfoService {
    private
    TalentInfoDao talentDao;
    @Autowired

    public
    TalentInfoInfoManager ( TalentInfoDao talentDao ) {
        this.talentDao = talentDao;
    }
}
