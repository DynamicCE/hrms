package kodlamaio.hrms.business.services.systemConfigurations.concretes;

import kodlamaio.hrms.business.services.systemConfigurations.abstracts.WebAddressService;
import kodlamaio.hrms.core.result.DataResult;
import kodlamaio.hrms.core.result.SuccessDataResult;
import kodlamaio.hrms.dataAccess.cvDao.WebAddressDao;
import kodlamaio.hrms.entities.systemConfigurationsEntities.WebAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WebAddressManager implements WebAddressService {

    private final WebAddressDao webAddressDao;

    @Autowired
    public WebAddressManager(WebAddressDao webAddressDao) {
        this.webAddressDao = webAddressDao;
    }

    @Override
    public DataResult<List<WebAddress>> getAll() {
        List<WebAddress> result = webAddressDao.findAll();
        return new SuccessDataResult<>(result, "Tüm web adresleri başarıyla getirildi.");
    }

    @Override
    public DataResult<WebAddress> add(WebAddress webAddress) {
        WebAddress result = webAddressDao.save(webAddress);
        return new SuccessDataResult<>(result, "Yeni web adresi başarıyla eklendi.");
    }

    @Override
    public DataResult<WebAddress> update(WebAddress webAddress) {
        WebAddress result = webAddressDao.save(webAddress);
        return new SuccessDataResult<>(result, "Web adresi başarıyla güncellendi.");
    }

    @Override
    public DataResult<Void> delete(Long id) {
        webAddressDao.deleteById(id);
        return new SuccessDataResult<>(null, "Web adresi başarıyla silindi.");
    }
}