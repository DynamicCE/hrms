package kodlamaio.hrms.api.controllers.jobControllers;

import kodlamaio.hrms.business.services.job.abstracts.JobTitleService;
import kodlamaio.hrms.core.DataResult;
import kodlamaio.hrms.core.Result;
import kodlamaio.hrms.entities.jobEntities.JobTitle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.crypto.Data;
import java.util.List;

@RestController
@RequestMapping("api/jobTitles/")
public
class JobTitleController {
    private
    JobTitleService jobTitleService;
    @Autowired
    public
    JobTitleController ( JobTitleService jobTitleService ) {
        this.jobTitleService = jobTitleService;
    }

    @GetMapping("getAll")
    public
    ResponseEntity<DataResult<List<JobTitle>>> getAll(){
        DataResult<List<JobTitle>> result = jobTitleService.getAll ();
        return ResponseEntity.ok ( result );
    }

    @PostMapping(value = "add", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Result> add( @RequestBody JobTitle jobTitle ){
        Result result = jobTitleService.add ( jobTitle );
        return ResponseEntity.ok ( result );
    }

    @DeleteMapping("delete")
    public ResponseEntity<Result> delete(@RequestBody JobTitle jobTitle){
        Result result = jobTitleService.delete ( jobTitle );
        return ResponseEntity.ok ( result );
    }
}
