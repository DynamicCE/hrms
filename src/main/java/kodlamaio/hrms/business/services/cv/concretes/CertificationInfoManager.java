package kodlamaio.hrms.business.services.cv.concretes;

import kodlamaio.hrms.dataAccess.cvDao.CertificationInfoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.services.cv.abstracts.CertificationInfoService;

@Service
public
class CertificationInfoManager implements CertificationInfoService {
    private
    CertificationInfoDao certificationDao;

    @Autowired
    public
    CertificationInfoManager ( CertificationInfoDao certificationDao ) {
        this.certificationDao = certificationDao;
    }
}
