package kodlamaio.hrms.business.concretes;

import java.util.List;

import kodlamaio.hrms.dataAccess.user.abstracts.CandidateDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.CandidateService;
import kodlamaio.hrms.dataAccess.user.abstracts.UserDao;
import kodlamaio.hrms.entities.userEntities.Candidate;
@Service
public
class CandidateManager implements CandidateService{
    @Autowired
    private
    CandidateDao candidateDao;


    @Override
    public List<Candidate> getAll() {
        candidateDao.findAll ();
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }

}
