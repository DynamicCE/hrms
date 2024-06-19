package kodlamaio.hrms.api.controllers.cvControllers;

import kodlamaio.hrms.business.services.cv.abstracts.TalentInfoService;
import kodlamaio.hrms.core.result.DataResult;
import kodlamaio.hrms.entities.cvEntities.Talent;
import kodlamaio.hrms.entities.dtos.cvDtos.TalentInfoDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/talents")
public class TalentInfoController {

    private final TalentInfoService talentInfoService;

    public TalentInfoController(TalentInfoService talentInfoService) {
        this.talentInfoService = talentInfoService;
    }

    @GetMapping("/getallbycandidateid")
    public ResponseEntity<DataResult<List<Talent>>> getAllByCandidateId(@RequestParam Long candidateId) {
        DataResult<List<Talent>> result = talentInfoService.getAllByCandidateId(candidateId);
        if (result.isSuccess()) {
            return ResponseEntity.ok(result);
        }
        return ResponseEntity.badRequest().body(result);
    }

    @PostMapping("/add")
    public ResponseEntity<DataResult<Talent>> add(@RequestBody Talent talentInfo) {
        DataResult<Talent> result = talentInfoService.add(talentInfo);
        if (result.isSuccess()) {
            return ResponseEntity.ok(result);
        }
        return ResponseEntity.badRequest().body(result);
    }

    @PutMapping("/update")
    public ResponseEntity<DataResult<Talent>> update(@RequestBody Talent talentInfo) {
        DataResult<Talent> result = talentInfoService.update(talentInfo);
        if (result.isSuccess()) {
            return ResponseEntity.ok(result);
        }
        return ResponseEntity.badRequest().body(result);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<DataResult<Void>> delete(@RequestParam Long id) {
        DataResult<Void> result = talentInfoService.delete(id);
        if (result.isSuccess()) {
            return ResponseEntity.ok(result);
        }
        return ResponseEntity.badRequest().body(result);
    }

    @GetMapping("/getalldtosbycandidateid")
    public ResponseEntity<DataResult<List<TalentInfoDto>>> getAllDtosByCandidateId(@RequestParam Long candidateId) {
        DataResult<List<TalentInfoDto>> result = talentInfoService.getAllDtosByCandidateId(candidateId);
        if (result.isSuccess()) {
            return ResponseEntity.ok(result);
        }
        return ResponseEntity.badRequest().body(result);
    }
}