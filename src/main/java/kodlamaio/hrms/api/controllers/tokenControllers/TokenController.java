package kodlamaio.hrms.api.controllers.tokenControllers;

import kodlamaio.hrms.business.services.token.abstracts.TokenService;
import kodlamaio.hrms.core.DataResult;
import kodlamaio.hrms.core.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/tokens/")
public
class TokenController {
    private
    TokenService tokenService;
    @Autowired
    public
    TokenController ( TokenService tokenService ) {
        this.tokenService = tokenService;
    }
    @PostMapping("create")
    public
    ResponseEntity<Result> createToken(@RequestBody String email){
        return ResponseEntity.ok ( tokenService.createToken ( email ) );
    }

    @GetMapping("validate")
    public ResponseEntity<DataResult> validateToken(@RequestBody String token){
        return ResponseEntity.ok ( tokenService.validateToken ( token ) );
    }

}
