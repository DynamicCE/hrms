package kodlamaio.hrms.api.controllers.cvControllers;

import kodlamaio.hrms.business.services.cv.abstracts.EducationInfoService;
import kodlamaio.hrms.core.result.DataResult;
import kodlamaio.hrms.entities.cvEntities.EducationInfo;
import kodlamaio.hrms.entities.dtos.cvDtos.EducationInfoDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/educations")
public class EducationInfoController {

    private final EducationInfoService educationInfoService;

    public EducationInfoController(EducationInfoService educationInfoService) {
        this.educationInfoService = educationInfoService;
    }

    @GetMapping("/getall")
    public ResponseEntity<DataResult<List<EducationInfo>>> getAll() {
        DataResult<List<EducationInfo>> result = educationInfoService.getAll();
        if (result.isSuccess()) {
            return ResponseEntity.ok(result);
        }
        return ResponseEntity.badRequest().body(result);
    }

    @PostMapping("/add")
    public ResponseEntity<DataResult<EducationInfo>> add(@RequestBody EducationInfo educationInfo) {
        DataResult<EducationInfo> result = educationInfoService.add(educationInfo);
        if (result.isSuccess()) {
            return ResponseEntity.ok(result);
        }
        return ResponseEntity.badRequest().body(result);
    }

    @PutMapping("/update")
    public ResponseEntity<DataResult<EducationInfo>> update(@RequestBody EducationInfo educationInfo) {
        DataResult<EducationInfo> result = educationInfoService.update(educationInfo);
        if (result.isSuccess()) {
            return ResponseEntity.ok(result);
        }
        return ResponseEntity.badRequest().body(result);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<DataResult<Void>> delete(@RequestParam Long id) {
        DataResult<Void> result = educationInfoService.delete(id);
        if (result.isSuccess()) {
            return ResponseEntity.ok(result);
        }
        return ResponseEntity.badRequest().body(result);
    }

    @GetMapping("/getallbycandidateid")
    public ResponseEntity<DataResult<List<EducationInfo>>> getAllByCandidateId(@RequestParam Long candidateId) {
        DataResult<List<EducationInfo>> result = educationInfoService.getAllByCandidateId(candidateId);
        if (result.isSuccess()) {
            return ResponseEntity.ok(result);
        }
        return ResponseEntity.badRequest().body(result);
    }

    @GetMapping("/getalldtosbycandidateid")
    public ResponseEntity<DataResult<List<EducationInfoDto>>> getAllDtosByCandidateId(@RequestParam Long candidateId) {
        DataResult<List<EducationInfoDto>> result = educationInfoService.getAllDtosByCandidateId(candidateId);
        if (result.isSuccess()) {
            return ResponseEntity.ok(result);
        }
        return ResponseEntity.badRequest().body(result);
    }
}