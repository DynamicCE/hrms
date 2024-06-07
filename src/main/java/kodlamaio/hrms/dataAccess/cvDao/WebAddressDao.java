package kodlamaio.hrms.dataAccess.cvDao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kodlamaio.hrms.entities.systemProfileEntities.WebAddress;

@Repository
public interface WebAddressDao extends JpaRepository<WebAddress, Long> {
}
