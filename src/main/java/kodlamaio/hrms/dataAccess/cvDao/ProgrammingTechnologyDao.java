package kodlamaio.hrms.dataAccess.cvDao;

import kodlamaio.hrms.entities.systemProfileEntities.ProgrammingTechnology;
import org.springframework.data.jpa.repository.JpaRepository;

public
interface ProgrammingTechnologyDao extends JpaRepository<ProgrammingTechnology, Long> {
}
