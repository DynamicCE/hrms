package kodlamaio.hrms.api.controllers.cvControllers;

import kodlamaio.hrms.business.services.cv.abstracts.CertificationInfoService;
import kodlamaio.hrms.core.result.DataResult;
import kodlamaio.hrms.entities.cvEntities.CertificationInfo;
import kodlamaio.hrms.entities.dtos.cvDtos.CertificationInfoDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/certifications")
public class CertificationInfoController {

    private final CertificationInfoService certificationInfoService;

    public CertificationInfoController(CertificationInfoService certificationInfoService) {
        this.certificationInfoService = certificationInfoService;
    }

    @GetMapping("/getall")
    public ResponseEntity<DataResult<List<CertificationInfo>>> getAll() {
        DataResult<List<CertificationInfo>> result = certificationInfoService.getAll();
        if (result.isSuccess()) {
            return ResponseEntity.ok(result);
        }
        return ResponseEntity.badRequest().body(result);
    }

    @PostMapping("/add")
    public ResponseEntity<DataResult<CertificationInfo>> add(@RequestBody CertificationInfo certificationInfo) {
        DataResult<CertificationInfo> result = certificationInfoService.add(certificationInfo);
        if (result.isSuccess()) {
            return ResponseEntity.ok(result);
        }
        return ResponseEntity.badRequest().body(result);
    }

    @PutMapping("/update")
    public ResponseEntity<DataResult<CertificationInfo>> update(@RequestBody CertificationInfo certificationInfo) {
        DataResult<CertificationInfo> result = certificationInfoService.update(certificationInfo);
        if (result.isSuccess()) {
            return ResponseEntity.ok(result);
        }
        return ResponseEntity.badRequest().body(result);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<DataResult<Void>> delete(@RequestParam Long id) {
        DataResult<Void> result = certificationInfoService.delete(id);
        if (result.isSuccess()) {
            return ResponseEntity.ok(result);
        }
        return ResponseEntity.badRequest().body(result);
    }

    @GetMapping("/getalldtosbycandidateid")
    public ResponseEntity<DataResult<List<CertificationInfoDto>>> getAllDtosByCandidateId(@RequestParam Long candidateId) {
        DataResult<List<CertificationInfoDto>> result = certificationInfoService.getAllDtosByCandidateId(candidateId);
        if (result.isSuccess()) {
            return ResponseEntity.ok(result);
        }
        return ResponseEntity.badRequest().body(result);
    }
}