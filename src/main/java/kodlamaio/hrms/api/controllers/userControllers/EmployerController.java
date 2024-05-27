package kodlamaio.hrms.api.controllers.userControllers;

import java.util.Optional;

import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.core.Result;
import kodlamaio.hrms.entities.userEntities.User;
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

    @GetMapping
    public
    void getAll () {
        employerService.getAll ( );
    }

    @GetMapping("{getemployer}")
    public
    ResponseEntity<Optional<Employer>> getEmployer ( @PathVariable Long id ) {
        return ResponseEntity.ok ( employerService.findById ( id ) );
    }

    @PostMapping("{createEmployer}")
    public
    ResponseEntity<Employer> createEmployer ( @RequestBody Employer foundEmployer ) {
        return ResponseEntity.ok ( employerService.create ( foundEmployer ) );
    }

    @PutMapping({"updateEmployer"})
    public
    ResponseEntity<Employer> updateEmployer ( @PathVariable Long id, @RequestBody Employer foundEmployer ) {
        return ResponseEntity.ok ( employerService.update ( foundEmployer ) );
    }

    @DeleteMapping({"delete"})
    public
    void deleteEmployer ( @RequestBody Employer foundEmployer ) {
        employerService.delete ( foundEmployer );
    }

    @PostMapping("register")
    ResponseEntity<Result> register (@RequestBody Employer employer ){
        return ResponseEntity.ok ( employerService.register ( employer ) );
    }
}
