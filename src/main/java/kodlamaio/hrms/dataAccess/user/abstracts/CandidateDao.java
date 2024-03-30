package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kodlamaio.hrms.entities.userEntities.Candidate;
@Repository 
public
interface CandidateDao extends JpaRepository<Candidate, Integer> {
    public
    boolean existsByEmail ( String email );
    boolean existsByIdentityNo ( int identityNo );
}
