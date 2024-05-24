package kodlamaio.hrms.api.controllers.tokenControllers;

import kodlamaio.hrms.entities.tokenEntity.Token;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/tokens/")
public
class TokenController {
    public
    ResponseEntity<Token> createToken( String email)
}
