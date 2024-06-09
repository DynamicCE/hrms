package kodlamaio.hrms.business.concretes;

import java.util.List;
import java.util.Optional;

import kodlamaio.hrms.core.result.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.dataAccess.user.abstracts.EmployerDao;
import kodlamaio.hrms.entities.userEntities.Employer;
@Service
public
class EmployerManager implements EmployerService {
    private EmployerDao employerDao;

    @Autowired
    public
    EmployerManager ( EmployerDao employerDao ) {
        this.employerDao = employerDao;
    }




    @Override
    public
    DataResult<List<Employer>> getAll() {
        List<Employer> employers = employerDao.findAll();
        return new SuccessDataResult<> (employers, "Employers listed successfully");
    }

    @Override
    public DataResult<Optional<Employer>> findById(Long id) {
        Optional<Employer> employer = employerDao.findById(id);
        if (employer.isPresent()) {
            return new SuccessDataResult(employer, "Employer found successfully");
        } else {
            return new ErrorDataResult<>(Optional.empty(), "Employer not found");
        }
    }

    @Override
    public
    DataResult<Employer> add ( Employer employer ) {
        return new SuccessDataResult<> ( employerDao.save ( employer ) ,"başarıyla eklendi");
    }


    @Override
    public DataResult<Employer> create(Employer foundEmployer) {
        Employer savedEmployer = employerDao.save(foundEmployer);
        return new SuccessDataResult<> (savedEmployer, "Employer created successfully");
    }

    @Override
    public
    DataResult<Employer> update( Employer foundEmployer) {
        Employer updatedEmployer = employerDao.save(foundEmployer);
        return new SuccessDataResult<>(updatedEmployer, "Employer updated successfully");
    }

    @Override
    public
    Result delete( Employer employer) {
        try {
            employerDao.delete(employer);
            return new SuccessResult("Employer deleted successfully");
        } catch (Exception e) {
            return new ErrorResult ("Error deleting employer: " + e.getMessage());
        }
    }

    @Override
    public Result register(Employer employer) {
        if (employerDao.existsByEmail(employer.getEmail()) || employerDao.existsByPhoneNumber(employer.getPhoneNumber())) {
            return new ErrorResult("Hata! Zaten kayıtlısınız.");
        }
        if (!validateEmailDomain(employer)) {
            return new ErrorResult("Hata! Email domaini şirket domaini ile eşleşmiyor.");
        }
        employer.setApprovalStatus ( "PENDING" );
        employerDao.save(employer);
        return new SuccessResult("Başarıyla kaydolundu.");
    }

    private boolean validateEmailDomain(Employer employer) {
        String emailDomain = employer.getEmail().substring(employer.getEmail().indexOf("@") + 1);
        String websiteDomain = employer.getWebsite().replace("www.", "").replace("http://", "").replace("https://", "");
        return emailDomain.equals(websiteDomain);
    }

    public Result approveEmployer(Long employerId){
       Optional<Employer> foundEmployer = employerDao.findById ( employerId );
       if(foundEmployer.isPresent ()){
           Employer employer = foundEmployer.get ();
           employer.setApprovalStatus ( "APPROVED" );
           employerDao.save ( employer );
           return new SuccessResult ( "İşveren başarıyla onaylandı" );
       }
       return new ErrorResult ( "İşveren bulunamadı" );
    }

    @Override
    public
    Employer getCurrentEmployer () {
        return employerDao.findById(1L).orElse(null);
    }


}
