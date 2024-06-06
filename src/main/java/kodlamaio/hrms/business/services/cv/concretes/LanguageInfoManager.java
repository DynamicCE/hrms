package kodlamaio.hrms.business.services.cv.concretes;

import kodlamaio.hrms.dataAccess.cvDao.LanguageInfoDao;
import kodlamaio.hrms.entities.cvEntities.LanguageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.services.cv.abstracts.LanguageInfoService;

import java.util.List;

@Service
public class LanguageInfoManager implements LanguageInfoService {
    private
    LanguageInfoDao languageInfoDao;
    @Autowired

    public
    LanguageInfoManager ( LanguageInfoDao languageDao ) {
        this.languageInfoDao = languageDao;
    }

    @Override
    public void addLanguageInfo(LanguageInfo languageInfo) {
        if (languageInfo.getLevel() < 1 || languageInfo.getLevel() > 5) {
            throw new IllegalArgumentException("Seviye 1 ve 5 arasında olmalı");
        }
        languageInfoDao.save(languageInfo);
    }


    @Override
    public
    List<LanguageInfo> getAllLanguageInfos () {
        return languageInfoDao.findAll();
    }
}
