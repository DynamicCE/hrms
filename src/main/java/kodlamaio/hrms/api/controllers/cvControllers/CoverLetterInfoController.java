package kodlamaio.hrms.api.controllers.cvControllers;

import kodlamaio.hrms.business.services.cv.abstracts.CoverLetterInfoService;
import kodlamaio.hrms.core.result.DataResult;
import kodlamaio.hrms.entities.cvEntities.CoverLetterInfo;
import kodlamaio.hrms.entities.dtos.cvDtos.CoverLetterInfoDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/coverletters")
public class CoverLetterInfoController {

    private final CoverLetterInfoService coverLetterInfoService;

    public CoverLetterInfoController(CoverLetterInfoService coverLetterInfoService) {
        this.coverLetterInfoService = coverLetterInfoService;
    }

    @GetMapping("/getall")
    public ResponseEntity<DataResult<List<CoverLetterInfo>>> getAll() {
        DataResult<List<CoverLetterInfo>> result = coverLetterInfoService.getAll();
        if (result.isSuccess()) {
            return ResponseEntity.ok(result);
        }
        return ResponseEntity.badRequest().body(result);
    }

    @PostMapping("/add")
    public ResponseEntity<DataResult<CoverLetterInfo>> add(@RequestBody CoverLetterInfo coverLetterInfo) {
        DataResult<CoverLetterInfo> result = coverLetterInfoService.add(coverLetterInfo);
        if (result.isSuccess()) {
            return ResponseEntity.ok(result);
        }
        return ResponseEntity.badRequest().body(result);
    }

    @PutMapping("/update")
    public ResponseEntity<DataResult<CoverLetterInfo>> update(@RequestBody CoverLetterInfo coverLetterInfo) {
        DataResult<CoverLetterInfo> result = coverLetterInfoService.update(coverLetterInfo);
        if (result.isSuccess()) {
            return ResponseEntity.ok(result);
        }
        return ResponseEntity.badRequest().body(result);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<DataResult<Void>> delete(@RequestParam Long id) {
        DataResult<Void> result = coverLetterInfoService.delete(id);
        if (result.isSuccess()) {
            return ResponseEntity.ok(result);
        }
        return ResponseEntity.badRequest().body(result);
    }

    @GetMapping("/getalldtosbycandidateid")
    public ResponseEntity<DataResult<List<CoverLetterInfoDto>>> getAllDtosByCandidateId(@RequestParam Long candidateId) {
        DataResult<List<CoverLetterInfoDto>> result = coverLetterInfoService.getAllDtosByCandidateId(candidateId);
        if (result.isSuccess()) {
            return ResponseEntity.ok(result);
        }
        return ResponseEntity.badRequest().body(result);
    }
}