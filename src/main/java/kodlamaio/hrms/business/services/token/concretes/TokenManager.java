package kodlamaio.hrms.business.services.token.concretes;

import kodlamaio.hrms.business.services.token.abstracts.TokenService;
import kodlamaio.hrms.core.*;
import kodlamaio.hrms.dataAccess.token.TokenDao;
import kodlamaio.hrms.entities.tokenEntity.VerificationToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public
class TokenManager implements TokenService {
    private TokenDao tokenDao;
    @Autowired
    public
    TokenManager ( TokenDao tokenDao ) {
        this.tokenDao = tokenDao;
    }

    @Override
    public
    Result createToken ( String email ) {
        String generatedToken = UUID.randomUUID().toString();
        VerificationToken token = new VerificationToken ();
        token.setEmail(email);
        token.setToken(generatedToken);
        tokenDao.save(token);
        return new SuccessResult ( "token başarıyla oluşturuldu" );
    }

    @Override
    public DataResult<VerificationToken> validateToken(String verificationToken) {
        VerificationToken foundToken = tokenDao.findByToken(verificationToken);
        if (foundToken != null) {
            return new SuccessDataResult<>(foundToken, "Token geçerli");
        } else {
            return new ErrorDataResult<>(null, "Token geçersiz");
        }
    }

    @Override
    public
    Result delete ( String verificationToken ) {
        tokenDao.delete ( verificationToken );
        return new SuccessResult ( "Token silindi" ) ;
    }


}
