package kodlamaio.hrms.business.concretes;

import java.util.List;

import kodlamaio.hrms.business.services.email.abstracts.EmailVerificationService;
import kodlamaio.hrms.business.services.token.abstracts.TokenService;
import kodlamaio.hrms.core.*;
import kodlamaio.hrms.dataAccess.user.abstracts.CandidateDao;
import kodlamaio.hrms.entities.tokenEntity.VerificationToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.CandidateService;


import kodlamaio.hrms.entities.userEntities.Candidate;
@Service
public
class CandidateManager implements CandidateService{

    private
    CandidateDao candidateDao;
    private EmailVerificationService emailVerificationService;
    private TokenService tokenService;

    public
    CandidateManager ( CandidateDao candidateDao, EmailVerificationService emailVerificationService, TokenService tokenService ) {
        this.candidateDao = candidateDao;
        this.emailVerificationService = emailVerificationService;
        this.tokenService = tokenService;
    }

    @Autowired
    public
    CandidateManager ( CandidateDao candidateDao, EmailVerificationService emailVerificationService ) {
        this.candidateDao = candidateDao;
        this.emailVerificationService = emailVerificationService;

    }

    @Override
    public
    DataResult<List<Candidate>> getAll() {
        return new SuccessDataResult<List<Candidate>> ( candidateDao.findAll (),"işlem başarılı" );
    }

    @Override
    public
    Result register ( Candidate candidate ) {
        if(candidateDao.existsByEmail ( candidate.getEmail () ) || candidateDao.existsByIdentityNo ( candidate.getIdentityNo () )){
            return new ErrorResult ( "zaten kayıtlısınız" );
        }
        boolean mernis = fakeMernisVerification ( candidate );
        if(!mernis){
            return new ErrorResult ( "doğrulama başarısız" );
        }
        candidateDao.save ( candidate );
        return new SuccessResult ( "başarıyla kaydoldunuz, e-postanızı kontrol ediniz" );
    }



    private boolean fakeMernisVerification(Candidate candidate){
        return true; //fake servis her zaman başarılı
    }


}
