package kodlamaio.hrms.api.controllers.userControllers;

import java.util.List;
import java.util.Optional;

import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.core.DataResult;
import kodlamaio.hrms.core.Result;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import kodlamaio.hrms.entities.userEntities.Employer;

@RestController
@RequestMapping("/api/employers/")
public
class EmployerController {
    @Autowired
    private
    EmployerService employerService;

    @GetMapping("getall")
    public ResponseEntity<DataResult<List<Employer>>> getAll() {
        DataResult<List<Employer>> result = employerService.getAll();
        return ResponseEntity.ok(result);
    }

    @PostMapping("add")
    ResponseEntity<DataResult<Employer>> add (@RequestBody Employer employer ){
        DataResult<Employer> result = employerService.add ( employer );
        return ResponseEntity.ok ( result );
    }

    @GetMapping("getemployer/{id}")
    public ResponseEntity<DataResult<Optional<Employer>>> getEmployer(@PathVariable Long id) {
        DataResult<Optional<Employer>> result = employerService.findById(id);
        return ResponseEntity.ok(result);
    }

    @PostMapping("createEmployer")
    public ResponseEntity<DataResult<Employer>> createEmployer(@RequestBody Employer foundEmployer) {
        DataResult<Employer> result = employerService.create(foundEmployer);
        return ResponseEntity.ok(result);
    }

    @PutMapping("updateEmployer/{id}")
    public ResponseEntity<DataResult<Employer>> updateEmployer(@PathVariable Long id, @RequestBody Employer foundEmployer) {
        DataResult<Employer> result = employerService.update(foundEmployer);
        return ResponseEntity.ok(result);
    }

    @DeleteMapping("delete")
    public ResponseEntity<Result> deleteEmployer(@RequestBody Employer foundEmployer) {
        Result result = employerService.delete(foundEmployer);
        return ResponseEntity.ok(result);
    }

    @PostMapping("register")
    public ResponseEntity<Result> register(@RequestBody Employer employer) {
        Result result = employerService.register(employer);
        return ResponseEntity.ok(result);
    }

    @PostMapping("approveEmployer/{employerId}")
    public ResponseEntity<Result> approveEmployer(@PathVariable Long employerId) {
        Result result = employerService.approveEmployer(employerId);
        return ResponseEntity.ok(result);
    }

}
