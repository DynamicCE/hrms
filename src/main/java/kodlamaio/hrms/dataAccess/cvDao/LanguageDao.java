package kodlamaio.hrms.dataAccess.cvDao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kodlamaio.hrms.entities.cvEntities.Language;

@Repository
public interface LanguageDao extends JpaRepository<Language, Integer> {
}
