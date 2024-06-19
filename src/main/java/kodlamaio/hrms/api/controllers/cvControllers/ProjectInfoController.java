package kodlamaio.hrms.api.controllers.cvControllers;

import kodlamaio.hrms.business.services.cv.abstracts.ProjectInfoService;
import kodlamaio.hrms.core.result.DataResult;
import kodlamaio.hrms.entities.cvEntities.ProjectInfo;
import kodlamaio.hrms.entities.dtos.cvDtos.ProjectInfoDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/projects")
public class ProjectInfoController {

    private final ProjectInfoService projectInfoService;

    public ProjectInfoController(ProjectInfoService projectInfoService) {
        this.projectInfoService = projectInfoService;
    }

    @GetMapping("/getallbycandidateid")
    public ResponseEntity<DataResult<List<ProjectInfo>>> getAllByCandidateId(@RequestParam Long candidateId) {
        DataResult<List<ProjectInfo>> result = projectInfoService.getAllByCandidateId(candidateId);
        if (result.isSuccess()) {
            return ResponseEntity.ok(result);
        }
        return ResponseEntity.badRequest().body(result);
    }

    @PostMapping("/add")
    public ResponseEntity<DataResult<ProjectInfo>> add(@RequestBody ProjectInfo projectInfo) {
        DataResult<ProjectInfo> result = projectInfoService.add(projectInfo);
        if (result.isSuccess()) {
            return ResponseEntity.ok(result);
        }
        return ResponseEntity.badRequest().body(result);
    }

    @PutMapping("/update")
    public ResponseEntity<DataResult<ProjectInfo>> update(@RequestBody ProjectInfo projectInfo) {
        DataResult<ProjectInfo> result = projectInfoService.update(projectInfo);
        if (result.isSuccess()) {
            return ResponseEntity.ok(result);
        }
        return ResponseEntity.badRequest().body(result);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<DataResult<Void>> delete(@RequestParam Long id) {
        DataResult<Void> result = projectInfoService.delete(id);
        if (result.isSuccess()) {
            return ResponseEntity.ok(result);
        }
        return ResponseEntity.badRequest().body(result);
    }

    @GetMapping("/getalldtosbycandidateid")
    public ResponseEntity<DataResult<List<ProjectInfoDto>>> getAllDtosByCandidateId(@RequestParam Long candidateId) {
        DataResult<List<ProjectInfoDto>> result = projectInfoService.getAllDtosByCandidateId(candidateId);
        if (result.isSuccess()) {
            return ResponseEntity.ok(result);
        }
        return ResponseEntity.badRequest().body(result);
    }
}