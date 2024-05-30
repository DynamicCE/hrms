package kodlamaio.hrms.business.services.email.concretes;

import kodlamaio.hrms.business.services.email.abstracts.EmailService;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.services.email.abstracts.EmailVerificationService;
import kodlamaio.hrms.dataAccess.user.abstracts.CandidateDao;
import java.util.Map;
import java.util.HashMap;
import java.util.UUID;

@Service
public class EmailVerificationManager implements EmailVerificationService{
    private CandidateDao CandidateDao;
    private Map<String, String> verificationTokens = new HashMap<> ();
    public
    EmailVerificationManager ( CandidateDao CandidateDao ) {
        this.CandidateDao = CandidateDao;
    }

    @Override
    public boolean checkMail(String email) {
       return CandidateDao.existsByEmail(email);
    }





}
