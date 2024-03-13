package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.Candidate;

public
interface CandidateDao extends JpaRepository<Candidate, Integer> {
    public
    boolean existsByEmail ( String email );
    boolean existsByIdentityNo ( int identityNo );
}
