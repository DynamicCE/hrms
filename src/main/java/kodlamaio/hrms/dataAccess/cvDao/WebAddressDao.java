package kodlamaio.hrms.dataAccess.cvDao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kodlamaio.hrms.entities.cvEntities.WebAddress;

@Repository
public interface WebAddressDao extends JpaRepository<WebAddress, Long> {
}
