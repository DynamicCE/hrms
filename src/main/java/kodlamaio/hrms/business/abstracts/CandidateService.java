package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.result.DataResult;
import kodlamaio.hrms.core.result.Result;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.entities.userEntities.Candidate;

@Service
public
interface CandidateService {
    DataResult<List<Candidate>> getAll ();
    Result register(Candidate candidate);
    boolean verifyEmail(String token);
    Result addPhotoUrl(Long candidateId, String url);
}
