package kodlamaio.hrms.business.services.cv.concretes;

import kodlamaio.hrms.business.services.cv.abstracts.TalentInfoService;
import kodlamaio.hrms.core.result.DataResult;
import kodlamaio.hrms.core.result.SuccessDataResult;
import kodlamaio.hrms.dataAccess.cvDao.TalentInfoDao;
import kodlamaio.hrms.entities.cvEntities.TalentInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TalentInfoManager implements TalentInfoService {

    private final TalentInfoDao talentInfoDao;

    @Autowired
    public TalentInfoManager(TalentInfoDao talentInfoDao) {
        this.talentInfoDao = talentInfoDao;
    }

    @Override
    public DataResult<List<TalentInfo>> getAllByCandidateId(Long candidateId) {
        List<TalentInfo> result = talentInfoDao.findAllByCandidateId(candidateId);
        return new SuccessDataResult<>(result, "Adayın yetenek bilgileri başarıyla getirildi.");
    }

    @Override
    public DataResult<TalentInfo> add(TalentInfo talentInfo) {
        TalentInfo result = talentInfoDao.save(talentInfo);
        return new SuccessDataResult<>(result, "Yetenek bilgisi başarıyla eklendi.");
    }

    @Override
    public DataResult<TalentInfo> update(TalentInfo talentInfo) {
        TalentInfo result = talentInfoDao.save(talentInfo);
        return new SuccessDataResult<>(result, "Yetenek bilgisi başarıyla güncellendi.");
    }

    @Override
    public DataResult<Void> delete(Long id) {
        talentInfoDao.deleteById(id);
        return new SuccessDataResult<>(null, "Yetenek bilgisi başarıyla silindi.");
    }
}