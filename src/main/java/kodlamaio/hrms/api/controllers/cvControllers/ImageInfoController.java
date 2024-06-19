package kodlamaio.hrms.api.controllers.cvControllers;

import kodlamaio.hrms.business.services.cv.abstracts.ImageInfoService;
import kodlamaio.hrms.core.result.DataResult;
import kodlamaio.hrms.entities.cvEntities.ImageInfo;
import kodlamaio.hrms.entities.dtos.cvDtos.ImageInfoDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/images")
public class ImageInfoController {

    private final ImageInfoService imageInfoService;

    public ImageInfoController(ImageInfoService imageInfoService) {
        this.imageInfoService = imageInfoService;
    }

    @GetMapping("/getallbycandidateid")
    public ResponseEntity<DataResult<List<ImageInfo>>> getAllByCandidateId(@RequestParam Long candidateId) {
        DataResult<List<ImageInfo>> result = imageInfoService.getAllByCandidateId(candidateId);
        if (result.isSuccess()) {
            return ResponseEntity.ok(result);
        }
        return ResponseEntity.badRequest().body(result);
    }

    @PostMapping("/add")
    public ResponseEntity<DataResult<ImageInfo>> add(@RequestBody ImageInfo imageInfo) {
        DataResult<ImageInfo> result = imageInfoService.add(imageInfo);
        if (result.isSuccess()) {
            return ResponseEntity.ok(result);
        }
        return ResponseEntity.badRequest().body(result);
    }

    @PutMapping("/update")
    public ResponseEntity<DataResult<ImageInfo>> update(@RequestBody ImageInfo imageInfo) {
        DataResult<ImageInfo> result = imageInfoService.update(imageInfo);
        if (result.isSuccess()) {
            return ResponseEntity.ok(result);
        }
        return ResponseEntity.badRequest().body(result);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<DataResult<Void>> delete(@RequestParam Long id) {
        DataResult<Void> result = imageInfoService.delete(id);
        if (result.isSuccess()) {
            return ResponseEntity.ok(result);
        }
        return ResponseEntity.badRequest().body(result);
    }

    @GetMapping("/getdtobycandidateid")
    public ResponseEntity<DataResult<ImageInfoDto>> getDtoByCandidateId(@RequestParam Long candidateId) {
        DataResult<ImageInfoDto> result = imageInfoService.getDtoByCandidateId(candidateId);
        if (result.isSuccess()) {
            return ResponseEntity.ok(result);
        }
        return ResponseEntity.badRequest().body(result);
    }

    @GetMapping("/getalldtosbycandidateid")
    public ResponseEntity<DataResult<List<ImageInfoDto>>> getAllDtosByCandidateId(@RequestParam Long candidateId) {
        DataResult<List<ImageInfoDto>> result = imageInfoService.getAllDtosByCandidateId(candidateId);
        if (result.isSuccess()) {
            return ResponseEntity.ok(result);
        }
        return ResponseEntity.badRequest().body(result);
    }
}