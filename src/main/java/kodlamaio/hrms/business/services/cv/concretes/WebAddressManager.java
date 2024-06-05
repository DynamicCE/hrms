package kodlamaio.hrms.business.services.cv.concretes;

import kodlamaio.hrms.dataAccess.cvDao.WebAddressDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.services.cv.abstracts.WebAddressService;

@Service
public class WebAddressManager implements WebAddressService {
    private
    WebAddressDao webAddressDao;
    @Autowired

    public
    WebAddressManager ( WebAddressDao webAddressDao ) {
        this.webAddressDao = webAddressDao;
    }
}
