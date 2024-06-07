package kodlamaio.hrms.business.services.systemConfigurations.abstracts;

import kodlamaio.hrms.core.result.DataResult;
import kodlamaio.hrms.entities.systemConfigurationsEntities.WebAddress;

import java.util.List;

public interface WebAddressService {
    DataResult<List<WebAddress>> getAll();
    DataResult<WebAddress> add( WebAddress webAddress);
    DataResult<WebAddress> update(WebAddress webAddress);
    DataResult<Void> delete(Long id);
}