package kodlamaio.hrms.api.controllers.userControllers;

import kodlamaio.hrms.business.abstracts.CandidateService;
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
    private
    CandidateService candidateService;

    @Autowired
    public
    CandidateController ( CandidateService candidateService ) {
        this.candidateService = candidateService;
    }
    @GetMapping("getall")
    ResponseEntity<DataResult<List<Candidate>>> getAll (){
        return  ResponseEntity.ok ( candidateService.getAll () );
    }

    @PostMapping("register")
    public
    ResponseEntity<Result> register(@RequestBody Candidate candidate ){
        return ResponseEntity.ok ( candidateService.register ( candidate ) );
    }

    @GetMapping("verify-email")
    public ResponseEntity<Result> verifyEmail(@RequestParam String token) {
        boolean result = candidateService.verifyEmail(token);
        return result ? ResponseEntity.ok(new SuccessResult ("E-posta başarıyla doğrulandı.")) : ResponseEntity.badRequest().body(new ErrorResult ("Geçersiz token."));
    }
}
