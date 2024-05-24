package kodlamaio.hrms.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.entities.userEntities.Candidate;

@Service
public
interface CandidateService {
    List<Candidate> getAll ();
    void register();
}
