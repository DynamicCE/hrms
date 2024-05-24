package kodlamaio.hrms.api.controllers.userControllers;

import kodlamaio.hrms.business.abstracts.CandidateService;
import kodlamaio.hrms.core.Result;
import kodlamaio.hrms.entities.userEntities.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("register")
    public
    ResponseEntity<Result> register(@RequestBody Candidate candidate ){
        return ResponseEntity.ok ( candidateService.register ( candidate ) );
    }
}
