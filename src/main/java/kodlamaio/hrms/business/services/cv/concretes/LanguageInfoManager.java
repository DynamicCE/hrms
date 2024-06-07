package kodlamaio.hrms.business.services.cv.concretes;

import kodlamaio.hrms.business.services.cv.abstracts.LanguageInfoService;
import kodlamaio.hrms.core.result.DataResult;
import kodlamaio.hrms.core.result.SuccessDataResult;
import kodlamaio.hrms.dataAccess.cvDao.LanguageInfoDao;
import kodlamaio.hrms.entities.cvEntities.LanguageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageInfoManager implements LanguageInfoService {

    private final LanguageInfoDao languageInfoDao;

    @Autowired
    public LanguageInfoManager(LanguageInfoDao languageInfoDao) {
        this.languageInfoDao = languageInfoDao;
    }

    @Override
    public DataResult<List<LanguageInfo>> getAllByCandidateId(Long candidateId) {
        List<LanguageInfo> result = languageInfoDao.findAllByCandidateId(candidateId);
        return new SuccessDataResult<>(result, "Adayın dil bilgileri başarıyla getirildi.");
    }

    @Override
    public DataResult<LanguageInfo> add(LanguageInfo languageInfo) {
        LanguageInfo result = languageInfoDao.save(languageInfo);
        return new SuccessDataResult<>(result, "Dil bilgisi başarıyla eklendi.");
    }

    @Override
    public DataResult<LanguageInfo> update(LanguageInfo languageInfo) {
        LanguageInfo result = languageInfoDao.save(languageInfo);
        return new SuccessDataResult<>(result, "Dil bilgisi başarıyla güncellendi.");
    }

    @Override
    public DataResult<Void> delete(Long id) {
        languageInfoDao.deleteById(id);
        return new SuccessDataResult<>(null, "Dil bilgisi başarıyla silindi.");
    }
}