package kodlamaio.hrms.business.concretes;

import java.util.List;

import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.dataAccess.abstracts.EmployerDao;
import kodlamaio.hrms.entities.userEntities.Employer;

public
class EmployerManager implements EmployerService {
    private EmployerDao employerDao;

    public
    EmployerManager ( EmployerDao employerDao ) {
        this.employerDao = employerDao;
    }

    @Override
    public List<Employer> getAll() {
        return employerDao.findAll ();
    }
}
