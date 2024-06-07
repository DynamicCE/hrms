package kodlamaio.hrms.business.services.systemConfigurations.abstracts;

import kodlamaio.hrms.core.result.DataResult;
import kodlamaio.hrms.entities.systemConfigurationsEntities.ProgrammingTechnology;

import java.util.List;

public interface ProgrammingTechnologyService {
    DataResult<List<ProgrammingTechnology>> getAll();
    DataResult<ProgrammingTechnology> add(ProgrammingTechnology programmingTechnology);
    DataResult<ProgrammingTechnology> update(ProgrammingTechnology programmingTechnology);
    DataResult<Void> delete(Long id);
}