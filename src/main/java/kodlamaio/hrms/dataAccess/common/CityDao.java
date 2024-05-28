package kodlamaio.hrms.dataAccess.common;

import kodlamaio.hrms.entities.commonEntities.City;
import org.springframework.data.jpa.repository.JpaRepository;

public
interface CityDao extends JpaRepository<City,Integer> {
}
