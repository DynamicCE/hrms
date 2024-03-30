package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.CandidateService;
import kodlamaio.hrms.dataAccess.user.abstracts.UserDao;
import kodlamaio.hrms.entities.userEntities.Candidate;
@Service
public
class CandidateManager implements CandidateService{
private UserDao userDao;

    public
    CandidateManager ( UserDao userDao ) {
        this.userDao = userDao;
    }

    @Override
    public List<Candidate> getAll() {
        userDao.findAll ();
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }

}
