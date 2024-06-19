package kodlamaio.hrms.api.controllers.cvControllers;

import kodlamaio.hrms.business.services.cv.abstracts.LanguageInfoService;
import kodlamaio.hrms.core.result.DataResult;
import kodlamaio.hrms.entities.cvEntities.LanguageInfo;
import kodlamaio.hrms.entities.dtos.cvDtos.LanguageInfoDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/languages")
public class LanguageInfoController {

    private final LanguageInfoService languageInfoService;

    public LanguageInfoController(LanguageInfoService languageInfoService) {
        this.languageInfoService = languageInfoService;
    }

    @GetMapping("/getallbycandidateid")
    public ResponseEntity<DataResult<List<LanguageInfo>>> getAllByCandidateId(@RequestParam Long candidateId) {
        DataResult<List<LanguageInfo>> result = languageInfoService.getAllByCandidateId(candidateId);
        if (result.isSuccess()) {
            return ResponseEntity.ok(result);
        }
        return ResponseEntity.badRequest().body(result);
    }

    @PostMapping("/add")
    public ResponseEntity<DataResult<LanguageInfo>> add(@RequestBody LanguageInfo languageInfo) {
        DataResult<LanguageInfo> result = languageInfoService.add(languageInfo);
        if (result.isSuccess()) {
            return ResponseEntity.ok(result);
        }
        return ResponseEntity.badRequest().body(result);
    }

    @PutMapping("/update")
    public ResponseEntity<DataResult<LanguageInfo>> update(@RequestBody LanguageInfo languageInfo) {
        DataResult<LanguageInfo> result = languageInfoService.update(languageInfo);
        if (result.isSuccess()) {
            return ResponseEntity.ok(result);
        }
        return ResponseEntity.badRequest().body(result);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<DataResult<Void>> delete(@RequestParam Long id) {
        DataResult<Void> result = languageInfoService.delete(id);
        if (result.isSuccess()) {
            return ResponseEntity.ok(result);
        }
        return ResponseEntity.badRequest().body(result);
    }

    @GetMapping("/getalldtosbycandidateid")
    public ResponseEntity<DataResult<List<LanguageInfoDto>>> getAllDtosByCandidateId(@RequestParam Long candidateId) {
        DataResult<List<LanguageInfoDto>> result = languageInfoService.getAllDtosByCandidateId(candidateId);
        if (result.isSuccess()) {
            return ResponseEntity.ok(result);
        }
        return ResponseEntity.badRequest().body(result);
    }
}