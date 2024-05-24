package kodlamaio.hrms.business.services.token.abstracts;

import kodlamaio.hrms.entities.tokenEntity.Token;
import org.springframework.stereotype.Service;

@Service
public
interface TokenService {
    public Token createToken(String email);
    boolean validateToken(String token);
}
