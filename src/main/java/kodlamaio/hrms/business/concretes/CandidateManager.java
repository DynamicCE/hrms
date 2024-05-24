package kodlamaio.hrms.business.concretes;

import java.util.List;

import kodlamaio.hrms.core.ErrorResult;
import kodlamaio.hrms.core.Result;
import kodlamaio.hrms.core.SuccessResult;
import kodlamaio.hrms.dataAccess.user.abstracts.CandidateDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.CandidateService;
import kodlamaio.hrms.dataAccess.user.abstracts.UserDao;
import kodlamaio.hrms.entities.userEntities.Candidate;
@Service
public
class CandidateManager implements CandidateService{
    @Autowired
    private
    CandidateDao candidateDao;


    @Override
    public List<Candidate> getAll() {
        candidateDao.findAll ();
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }

    @Override
    public
    Result register ( Candidate candidate ) {
        if(candidateDao.existsByEmail ( candidate.getEmail () ) || candidateDao.existsByIdentityNo ( candidate.getIdentityNo () )){
            return new ErrorResult ( "zaten kayıtlısınız" );
        }
        boolean mernis = false;
        if(mernis){
            return new ErrorResult ( "doğrulama başarısız" );
        }
        candidateDao.save ( candidate );
        return new SuccessResult ( "başarıyla kaydoldunuz, e-postanızı kontrol ediniz" );
    }


}
