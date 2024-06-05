package kodlamaio.hrms.dataAccess.cvDao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kodlamaio.hrms.entities.cvEntities.CoverLetter;

@Repository
public interface CoverLetterDao extends JpaRepository<CoverLetter, Integer> {
}
