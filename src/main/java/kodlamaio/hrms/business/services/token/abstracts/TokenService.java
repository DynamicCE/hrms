package kodlamaio.hrms.business.services.token.abstracts;

import kodlamaio.hrms.core.DataResult;
import kodlamaio.hrms.core.Result;
import kodlamaio.hrms.entities.tokenEntities.VerificationToken;
import org.springframework.stereotype.Service;

@Service
public
interface TokenService {
    Result createToken( String email);
    DataResult<VerificationToken> validateToken(String verificationToken);
    Result delete(String verificationToken);
}
