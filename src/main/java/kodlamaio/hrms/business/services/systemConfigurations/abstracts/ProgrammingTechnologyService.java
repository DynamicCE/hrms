package kodlamaio.hrms.business.services.systemConfigurations.abstracts;

import kodlamaio.hrms.core.result.DataResult;
import kodlamaio.hrms.entities.systemConfigurationsEntities.ProgrammingTechnology;

public
interface ProgrammingTechnologyService {
    DataResult<ProgrammingTechnology> add(String content );
}
