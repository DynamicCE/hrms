package kodlamaio.hrms.business.services.email.concretes;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.services.email.abstracts.EmailVerificationService;
import kodlamaio.hrms.dataAccess.user.abstracts.CandidateDao;
@Service
public class EmailVerificationManager implements EmailVerificationService{
    private CandidateDao CandidateDao;

    public
    EmailVerificationManager ( CandidateDao CandidateDao ) {
        this.CandidateDao = CandidateDao;
    }

    @Override
    public boolean checkMail(String email) {
       return CandidateDao.existsByEmail(email);
    }

    @Override
    public
    void createVerificationToken ( String email ) {

    }

}
