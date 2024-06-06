package kodlamaio.hrms.api.controllers.jobControllers;

import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.business.services.job.abstracts.JobPostService;
import kodlamaio.hrms.core.result.DataResult;
import kodlamaio.hrms.core.result.Result;
import kodlamaio.hrms.entities.dtos.JobPostDto;
import kodlamaio.hrms.entities.jobEntities.JobPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("api/jobposts/")
public
class JobPostController {
    private
    JobPostService jobPostService;
    private
    EmployerService employerService;

    public
    JobPostController ( JobPostService jobPostService, EmployerService employerService ) {
        this.jobPostService = jobPostService;
        this.employerService = employerService;
    }

    @Autowired
    public
    JobPostController ( JobPostService jobPostService ) {
        this.jobPostService = jobPostService;

    }

    @GetMapping("getAll")
    public
    ResponseEntity<DataResult<List<JobPost>>> getAll () {
        DataResult<List<JobPost>> result = jobPostService.getAll ( );
        return ResponseEntity.ok ( result );
    }

    @PostMapping("add")
    public
    ResponseEntity<Result> add ( @RequestBody JobPost jobPost ) {
        Result result = jobPostService.add ( jobPost );
        return ResponseEntity.ok ( result );
    }

    @DeleteMapping
    public
    ResponseEntity<Result> delete ( @RequestBody JobPost jobPost ) {
        Result result = jobPostService.delete ( jobPost );
        return ResponseEntity.ok ( result );
    }

    @GetMapping("findByIsActive")
    ResponseEntity<DataResult<List<JobPost>>> findByIsActive ( Boolean isActive ) {
        DataResult<List<JobPost>> result = jobPostService.findByIsActive ( isActive );
        return ResponseEntity.ok ( result );
    }

    @GetMapping("findActiveJobPosts")
    ResponseEntity<DataResult<List<JobPostDto>>> findActiveJobPosts(){
        DataResult<List<JobPostDto>> result =jobPostService.findActiveJobPosts ();
        return ResponseEntity.ok ( result );
    }

    @GetMapping("findByIsActiveOrderByApplicationDeadline")
    ResponseEntity<DataResult<List<JobPost>>> findByIsActiveOrderByApplicationDeadline ( Boolean isActive ) {
        DataResult<List<JobPost>> result = jobPostService.findByIsActiveOrderByApplicationDeadline ( isActive );
        return ResponseEntity.ok ( result );
    }

    @GetMapping("getAllActiveByEmployer")
    ResponseEntity<DataResult<List<JobPost>>> getAllActiveByEmployer ( Long employerId ) {
        DataResult<List<JobPost>> result = jobPostService.getAllActiveByEmployer ( employerId );
        return ResponseEntity.ok ( result );
    }

    @PostMapping("activateJobPost")
    ResponseEntity<Result> activateJobPost ( Long jobId ) {
        Result result = jobPostService.activateJobPost ( jobId );
        return ResponseEntity.ok ( result );
    }

    @PostMapping("deactivateJobPost")
    ResponseEntity<Result> deactivateJobPost ( Long jobId ) {
        Result result = jobPostService.deactivateJobPost ( jobId );
        return ResponseEntity.ok ( result );
    }

    @PostMapping("findByApplicationDeadlineAfter")
    ResponseEntity<DataResult<List<JobPost>>> findByApplicationDeadlineAfter ( LocalDate date ) {
        DataResult<List<JobPost>> result = jobPostService.findByApplicationDeadlineAfter ( date );
        return ResponseEntity.ok ( result );
    }




}
