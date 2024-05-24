package kodlamaio.hrms.business.services.token.concretes;

import kodlamaio.hrms.business.services.token.abstracts.TokenService;
import kodlamaio.hrms.core.*;
import kodlamaio.hrms.dataAccess.tokenDao.TokenDao;
import kodlamaio.hrms.entities.tokenEntity.Token;
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
        Token token = new Token();
        token.setEmail(email);
        token.setToken(generatedToken);
        tokenDao.save(token);
        return new SuccessResult ( "token başarıyla oluşturuldu" );
    }

    @Override
    public
    DataResult<Token> validateToken ( String token ) {
        Token foundToken = tokenDao.findByToken ( token );
        if(foundToken!= null){
            return new SuccessDataResult<> ( foundToken,"Token geçerli" );
        }else{
            return new  ErrorDataResult<>( null,"Token geçersiz");
        }
    }
}
