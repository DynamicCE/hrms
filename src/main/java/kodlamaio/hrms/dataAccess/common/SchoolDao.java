package kodlamaio.hrms.dataAccess.common;

import kodlamaio.hrms.entities.commonEntities.School;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public
interface SchoolDao extends JpaRepository<School,Long> {
    List<School> findByCandidateIdOrderByGraduationYearDesc( Long candidateId);
}
