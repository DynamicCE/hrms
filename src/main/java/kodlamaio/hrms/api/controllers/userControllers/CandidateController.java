package kodlamaio.hrms.api.controllers.userControllers;

import kodlamaio.hrms.business.abstracts.CandidateService;
import kodlamaio.hrms.business.services.token.abstracts.TokenService;
import kodlamaio.hrms.core.DataResult;
import kodlamaio.hrms.core.ErrorResult;
import kodlamaio.hrms.core.Result;
import kodlamaio.hrms.core.SuccessResult;
import kodlamaio.hrms.entities.userEntities.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/candidates/")
public
class CandidateController {
    private final
    CandidateService candidateService;
    private final TokenService tokenService;
    @Autowired
    public
    CandidateController ( CandidateService candidateService, TokenService tokenService ) {
        this.candidateService = candidateService;
        this.tokenService = tokenService;
    }
    @GetMapping("getall")
    ResponseEntity<DataResult<List<Candidate>>> getAll (){
        return  ResponseEntity.ok ( candidateService.getAll () );
    }

    @PostMapping("register")
    public ResponseEntity<Result> register(@RequestBody Candidate candidate) {
        Result result = candidateService.register(candidate);
        if (result.isSuccess()) {
            tokenService.createToken(candidate.getEmail());
        }
        return ResponseEntity.ok(result);
    }

    @GetMapping("verify-email")
    public ResponseEntity<Result> verifyEmail(@RequestParam String token) {
        boolean result = tokenService.validateToken(token).isSuccess();
        return result ? ResponseEntity.ok(new SuccessResult("E-posta başarıyla doğrulandı.")) : ResponseEntity.badRequest().body(new ErrorResult("Geçersiz token."));    }
}
