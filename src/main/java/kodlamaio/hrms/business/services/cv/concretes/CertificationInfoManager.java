package kodlamaio.hrms.business.services.cv.concretes;

import kodlamaio.hrms.business.services.cv.abstracts.CertificationInfoService;
import kodlamaio.hrms.core.result.DataResult;
import kodlamaio.hrms.core.result.SuccessDataResult;
import kodlamaio.hrms.dataAccess.cvDao.CertificationInfoDao;
import kodlamaio.hrms.entities.cvEntities.CertificationInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CertificationInfoManager implements CertificationInfoService {

    private final CertificationInfoDao certificationInfoDao;

    @Autowired
    public CertificationInfoManager(CertificationInfoDao certificationInfoDao) {
        this.certificationInfoDao = certificationInfoDao;
    }

    @Override
    public DataResult<List<CertificationInfo>> getAll() {
        List<CertificationInfo> result = certificationInfoDao.findAll();
        return new SuccessDataResult<>(result, "Tüm sertifika bilgileri başarıyla getirildi.");
    }

    @Override
    public DataResult<CertificationInfo> add(CertificationInfo certificationInfo) {
        CertificationInfo result = certificationInfoDao.save(certificationInfo);
        return new SuccessDataResult<>(result, "Sertifika bilgisi başarıyla eklendi.");
    }

    @Override
    public DataResult<CertificationInfo> update(CertificationInfo certificationInfo) {
        CertificationInfo result = certificationInfoDao.save(certificationInfo);
        return new SuccessDataResult<>(result, "Sertifika bilgisi başarıyla güncellendi.");
    }

    @Override
    public DataResult<Void> delete(Long id) {
        certificationInfoDao.deleteById(id);
        return new SuccessDataResult<>(null, "Sertifika bilgisi başarıyla silindi.");
    }
}