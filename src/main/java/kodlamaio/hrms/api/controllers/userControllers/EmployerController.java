package kodlamaio.hrms.api.controllers.userControllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.entities.userEntities.Employer;

@RestController
@RequestMapping("/api/employers")
public
class EmployerController {
    @Autowired
    private
    EmployerService employerService;

    @GetMapping
    public
    ResponseEntity<List<Employer>> getAllEmployers(){
        return ResponseEntity.ok ( employerService.getAll () );
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Employer>> getEmployer( @PathVariable Long id ){
        employerService.get
    }
}
