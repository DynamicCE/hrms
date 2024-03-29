package kodlamaio.hrms.business.services.email.concretes;

import kodlamaio.hrms.business.services.email.abstracts.EmailVerificationService;
import kodlamaio.hrms.dataAccess.abstracts.CandidateDao;

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

}
