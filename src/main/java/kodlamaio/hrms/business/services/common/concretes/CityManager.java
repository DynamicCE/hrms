package kodlamaio.hrms.business.services.common.concretes;

import kodlamaio.hrms.business.services.common.abstracts.CityService;
import kodlamaio.hrms.core.DataResult;
import kodlamaio.hrms.core.SuccessDataResult;
import kodlamaio.hrms.dataAccess.common.CityDao;
import kodlamaio.hrms.entities.commonEntities.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public
class CityManager implements CityService {
    private CityDao cityDao;
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
