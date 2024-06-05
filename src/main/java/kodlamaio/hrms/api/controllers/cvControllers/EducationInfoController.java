package kodlamaio.hrms.api.controllers.cvControllers;

import kodlamaio.hrms.business.services.cv.abstracts.EducationInfoService;
import kodlamaio.hrms.core.DataResult;
import kodlamaio.hrms.core.Result;
import kodlamaio.hrms.entities.cvEntities.EducationInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/educationInfo/")
public
class EducationInfoController {
    private
    EducationInfoService educationInfoService;
    @Autowired

    public
    EducationInfoController ( EducationInfoService educationInfoService ) {
        this.educationInfoService = educationInfoService;
    }
    @PostMapping("add")
    ResponseEntity<Result> add( @RequestBody  EducationInfo educationInfo){
        Result result = educationInfoService.add(educationInfo);
        return ResponseEntity.ok ( result );
    }
    @PostMapping("getAllByCandidateId")
    ResponseEntity<DataResult<List<EducationInfo>>> getAllByCandidateId( Long candidateId){
        DataResult result = educationInfoService.getAllByCandidateId ( candidateId );
        return ResponseEntity.ok ( result );
    }
}
