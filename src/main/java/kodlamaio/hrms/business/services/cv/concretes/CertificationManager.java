package kodlamaio.hrms.business.services.cv.concretes;

import kodlamaio.hrms.dataAccess.cvDao.CertificationDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.services.cv.abstracts.CertificationService;

@Service
public
class CertificationManager implements CertificationService {
    private
    CertificationDao certificationDao;

    @Autowired
    public
    CertificationManager ( CertificationDao certificationDao ) {
        this.certificationDao = certificationDao;
    }
}
