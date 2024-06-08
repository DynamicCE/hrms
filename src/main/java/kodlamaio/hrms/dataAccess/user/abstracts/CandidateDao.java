package kodlamaio.hrms.dataAccess.user.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kodlamaio.hrms.entities.userEntities.Candidate;
@Repository 
public
interface CandidateDao extends JpaRepository<Candidate, Long> {

    boolean existsByEmail ( String email );
    boolean existsByIdentityNo ( String identityNo );

}
