package kodlamaio.hrms.dataAccess.systemConfigurationsDao;

import kodlamaio.hrms.entities.systemConfigurationsEntities.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public
interface CityDao extends JpaRepository<City,Integer> {
}
