package kodlamaio.hrms.business.services.common.abstracts;

import kodlamaio.hrms.core.result.DataResult;
import kodlamaio.hrms.entities.commonEntities.City;


import java.util.List;

public
interface CityService {
    DataResult<List<City>> getAll();
}
