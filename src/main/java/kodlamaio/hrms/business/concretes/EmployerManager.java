package kodlamaio.hrms.business.concretes;

import java.util.List;

import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.dataAccess.abstracts.UserDao;
import kodlamaio.hrms.entities.Employer;

public
class EmployerManager implements EmployerService {
    private UserDao userDao;

    public
    EmployerManager ( UserDao userDao ) {
        this.userDao = userDao;
    }

    @Override
    public List<Employer> getAll() {
        userDao.findAll ();
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }
}
