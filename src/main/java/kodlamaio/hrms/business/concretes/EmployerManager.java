package kodlamaio.hrms.business.concretes;

import java.util.List;
import java.util.Optional;

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

    @Override
    public
    Optional<Employer> findById ( Long id ) {
        return employerDao.findById ( id );
    }

    @Override
    public
    Employer create ( Employer foundEmployer ) {
        return employerDao.save ( foundEmployer );
    }

    @Override
    public
    Employer update ( Employer foundEmployer ) {
        return employerDao.save ( foundEmployer );
    }

    @Override
    public
    Employer delete (Employer employer) {
         employerDao.delete ( employer );
         return employer;
    }


}
