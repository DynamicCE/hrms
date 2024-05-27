package kodlamaio.hrms.business.concretes;

import java.util.List;
import java.util.Optional;

import kodlamaio.hrms.core.ErrorResult;
import kodlamaio.hrms.core.Result;
import kodlamaio.hrms.core.SuccessResult;
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
    void delete (Employer employer) {
         employerDao.delete ( employer );
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


}
