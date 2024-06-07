package kodlamaio.hrms.api.controllers.cvControllers;

import kodlamaio.hrms.business.services.cv.abstracts.ProgrammingTechnologyService;
import kodlamaio.hrms.entities.systemConfigurationsEntities.ProgrammingTechnology;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/programmingTechnologies")
public class ProgrammingTechnologyController {

    private ProgrammingTechnologyService programmingTechnologyService;

    @Autowired
    public ProgrammingTechnologyController(ProgrammingTechnologyService programmingTechnologyService) {
        this.programmingTechnologyService = programmingTechnologyService;
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<ProgrammingTechnology>> getAll() {
        return ResponseEntity.ok(programmingTechnologyService.getAll());
    }

    @PostMapping("/add")
    public ResponseEntity<ProgrammingTechnology> add(@RequestBody ProgrammingTechnology programmingTechnology) {
        return ResponseEntity.ok(programmingTechnologyService.add(programmingTechnology));
    }

    @PutMapping("/update")
    public ResponseEntity<ProgrammingTechnology> update(@RequestBody ProgrammingTechnology programmingTechnology) {
        return ResponseEntity.ok(programmingTechnologyService.update(programmingTechnology));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        programmingTechnologyService.delete(id);
        return ResponseEntity.ok().build();
    }
}