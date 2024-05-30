package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.DataResult;
import kodlamaio.hrms.core.Result;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.entities.userEntities.Candidate;

@Service
public
interface CandidateService {
    DataResult<List<Candidate>> getAll ();
    Result register(Candidate candidate);
    boolean verifyEmail(String token);
}
