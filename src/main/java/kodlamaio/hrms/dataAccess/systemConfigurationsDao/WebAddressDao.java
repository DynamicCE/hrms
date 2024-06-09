package kodlamaio.hrms.dataAccess.systemConfigurationsDao;

import kodlamaio.hrms.entities.systemConfigurationsEntities.WebAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public
interface WebAddressDao extends JpaRepository<WebAddress,Long> {
}
