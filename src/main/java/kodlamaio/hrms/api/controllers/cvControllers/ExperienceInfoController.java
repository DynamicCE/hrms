package kodlamaio.hrms.api.controllers.cvControllers;

import kodlamaio.hrms.business.services.cv.abstracts.ExperienceInfoService;
import kodlamaio.hrms.core.result.DataResult;
import kodlamaio.hrms.entities.cvEntities.ExperienceInfo;
import kodlamaio.hrms.entities.dtos.cvDtos.ExperienceInfoDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/experiences")
public class ExperienceInfoController {

    private final ExperienceInfoService experienceInfoService;

    public ExperienceInfoController(ExperienceInfoService experienceInfoService) {
        this.experienceInfoService = experienceInfoService;
    }

    @GetMapping("/getall")
    public ResponseEntity<DataResult<List<ExperienceInfo>>> getAll() {
        DataResult<List<ExperienceInfo>> result = experienceInfoService.getAll();
        if (result.isSuccess()) {
            return ResponseEntity.ok(result);
        }
        return ResponseEntity.badRequest().body(result);
    }

    @GetMapping("/getallbycandidateid")
    public ResponseEntity<DataResult<List<ExperienceInfo>>> getAllByCandidateId(@RequestParam Long candidateId) {
        DataResult<List<ExperienceInfo>> result = experienceInfoService.getAllByCandidateId(candidateId);
        if (result.isSuccess()) {
            return ResponseEntity.ok(result);
        }
        return ResponseEntity.badRequest().body(result);
    }

    @PostMapping("/add")
    public ResponseEntity<DataResult<ExperienceInfo>> add(@RequestBody ExperienceInfo experienceInfo) {
        DataResult<ExperienceInfo> result = experienceInfoService.add(experienceInfo);
        if (result.isSuccess()) {
            return ResponseEntity.ok(result);
        }
        return ResponseEntity.badRequest().body(result);
    }

    @PutMapping("/update")
    public ResponseEntity<DataResult<ExperienceInfo>> update(@RequestBody ExperienceInfo experienceInfo) {
        DataResult<ExperienceInfo> result = experienceInfoService.update(experienceInfo);
        if (result.isSuccess()) {
            return ResponseEntity.ok(result);
        }
        return ResponseEntity.badRequest().body(result);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<DataResult<Void>> delete(@RequestParam Long id) {
        DataResult<Void> result = experienceInfoService.delete(id);
        if (result.isSuccess()) {
            return ResponseEntity.ok(result);
        }
        return ResponseEntity.badRequest().body(result);
    }

    @GetMapping("/getallbycandidateidorderbyendyeardesc")
    public ResponseEntity<DataResult<List<ExperienceInfo>>> getAllByCandidateIdOrderByEndYearDesc(@RequestParam Long candidateId) {
        DataResult<List<ExperienceInfo>> result = experienceInfoService.getAllByCandidateIdOrderByEndYearDesc(candidateId);
        if (result.isSuccess()) {
            return ResponseEntity.ok(result);
        }
        return ResponseEntity.badRequest().body(result);
    }

    @GetMapping("/getalldtosbycandidateid")
    public ResponseEntity<DataResult<List<ExperienceInfoDto>>> getAllDtosByCandidateId(@RequestParam Long candidateId) {
        DataResult<List<ExperienceInfoDto>> result = experienceInfoService.getAllDtosByCandidateId(candidateId);
        if (result.isSuccess()) {
            return ResponseEntity.ok(result);
        }
        return ResponseEntity.badRequest().body(result);
    }
}