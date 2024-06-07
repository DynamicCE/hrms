package kodlamaio.hrms.dataAccess.cvDao;

import kodlamaio.hrms.entities.systemConfigurationsEntities.ProgrammingTechnology;
import org.springframework.data.jpa.repository.JpaRepository;

public
interface ProgrammingTechnologyDao extends JpaRepository<ProgrammingTechnology, Long> {
}
