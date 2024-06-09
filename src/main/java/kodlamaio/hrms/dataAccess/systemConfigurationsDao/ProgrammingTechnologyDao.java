package kodlamaio.hrms.dataAccess.systemConfigurationsDao;

import kodlamaio.hrms.entities.systemConfigurationsEntities.ProgrammingTechnology;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public
interface ProgrammingTechnologyDao extends JpaRepository<ProgrammingTechnology,Long> {
}
