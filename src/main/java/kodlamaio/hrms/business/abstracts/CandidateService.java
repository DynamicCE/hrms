package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.entities.userEntities.Candidate;

public
interface CandidateService {
    List<Candidate> getAll( );
}
