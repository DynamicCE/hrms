package kodlamaio.hrms.api.controllers.jobControllers;

import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.business.services.job.abstracts.JobPostService;
import kodlamaio.hrms.core.DataResult;
import kodlamaio.hrms.core.Result;
import kodlamaio.hrms.core.SuccessDataResult;
import kodlamaio.hrms.dataAccess.job.abstracts.JobPostDao;
import kodlamaio.hrms.entities.dtos.JobPostDto;
import kodlamaio.hrms.entities.jobEntities.JobPost;
import kodlamaio.hrms.entities.userEntities.Employer;
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

    private JobPost convertToEntity( JobPostDto jobPostDto) {
        JobPost jobPost = new JobPost();
        jobPost.setJobTitle(jobPostDto.getJobTitle());
        jobPost.setDescription(jobPostDto.getJobDescription());
        jobPost.setCity(jobPostDto.getCity());
        jobPost.setMinSalary(jobPostDto.getMinSalary());
        jobPost.setMaxSalary(jobPostDto.getMaxSalary());
        jobPost.setNumOfPositions(jobPostDto.getOpenPositions());
        jobPost.setApplicationDeadline(jobPostDto.getApplicationDeadline());

        // postedDate ve isActive gibi alanlar burada default olarak ayarlanabilir
        jobPost.setPostedDate(LocalDate.now());
        jobPost.setActive(true);
        Employer employer = employerService.getCurrentEmployer();
        jobPost.setEmployer(employer);


        return jobPost;
    }

}
