package kodlamaio.hrms.business.services.systemConfigurations.concretes;

import kodlamaio.hrms.business.services.systemConfigurations.abstracts.CityService;
import kodlamaio.hrms.core.result.DataResult;
import kodlamaio.hrms.core.result.SuccessDataResult;
import kodlamaio.hrms.dataAccess.systemConfigurationsDao.CityDao;
import kodlamaio.hrms.entities.systemConfigurationsEntities.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public
class CityManager implements CityService {
    private final CityDao cityDao;
    @Autowired
    public
    CityManager ( CityDao cityDao ) {
        this.cityDao = cityDao;
    }

    @Override
    public
    DataResult<List<City>> getAll () {
        return new SuccessDataResult<> ( cityDao.findAll (),"şehirler getirildi" );
    }
}
