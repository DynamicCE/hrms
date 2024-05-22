package kodlamaio.hrms.api.controllers.jobControllers;

import kodlamaio.hrms.business.services.job.abstracts.JobPostService;
import kodlamaio.hrms.core.DataResult;
import kodlamaio.hrms.core.Result;
import kodlamaio.hrms.core.SuccessDataResult;
import kodlamaio.hrms.entities.jobEntities.JobPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/jobposts/")
public
class JobPostController {
    private
    JobPostService jobPostService;
    @Autowired
    public
    JobPostController ( JobPostService jobPostService ) {
        this.jobPostService = jobPostService;
    }

    @GetMapping("getAll")
    public
    ResponseEntity<DataResult<List<JobPost>>> getAll(){
        DataResult<List<JobPost>> result = jobPostService.getAll ();
        return ResponseEntity.ok ( result );
    }

    @PostMapping("add")
    public ResponseEntity<Result> add(@RequestBody JobPost jobPost){
        Result result = jobPostService.add ( jobPost );
        return ResponseEntity.ok ( result);
    }
    @DeleteMapping
    public ResponseEntity<Result> delete(@RequestBody JobPost jobPost){
        Result result = jobPostService.delete ( jobPost );
        return ResponseEntity.ok ( result );
    }
}
