package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.dataAccess.user.abstracts.EmployerDao;
import kodlamaio.hrms.entities.userEntities.Employer;
@Service
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
