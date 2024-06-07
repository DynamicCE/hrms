package kodlamaio.hrms.business.services.systemConfigurations.abstracts;

import kodlamaio.hrms.core.result.DataResult;
import kodlamaio.hrms.entities.systemConfigurationsEntities.City;


import java.util.List;

public
interface CityService {
    DataResult<List<City>> getAll();
}
