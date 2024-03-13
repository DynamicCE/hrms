package kodlamaio.hrms.business.concretes;

import java.util.List;

import kodlamaio.hrms.business.abstracts.CandidateService;
import kodlamaio.hrms.dataAccess.abstracts.UserDao;
import kodlamaio.hrms.entities.Candidates;

public
class CandidateManager implements CandidateService{
private UserDao userDao;

    public
    CandidateManager ( UserDao userDao ) {
        this.userDao = userDao;
    }

    @Override
    public List<Candidates> getAll() {
        userDao.findAll ();
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }

}
