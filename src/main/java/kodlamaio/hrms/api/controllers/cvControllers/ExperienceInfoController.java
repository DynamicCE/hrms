package kodlamaio.hrms.api.controllers.cvControllers;

import kodlamaio.hrms.business.services.cv.abstracts.ExperienceInfoService;
import kodlamaio.hrms.core.DataResult;
import kodlamaio.hrms.core.Result;
import kodlamaio.hrms.entities.cvEntities.EducationInfo;
import kodlamaio.hrms.entities.cvEntities.ExperienceInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/experienceInfo/")
public
class ExperienceInfoController {
    private
    ExperienceInfoService experienceInfoService;

    @Autowired
    public
    ExperienceInfoController ( ExperienceInfoService experienceInfoService ) {
        this.experienceInfoService = experienceInfoService;
    }

    @PostMapping("getAll")
    ResponseEntity<DataResult<List<ExperienceInfo>>> getAll ( ) {
        DataResult<List<ExperienceInfo>>  result = experienceInfoService.getAll (  );
        return ResponseEntity.ok ( result );
    }

    @PostMapping("add")
    ResponseEntity<Result> add ( @RequestBody ExperienceInfo experienceInfo ) {
        Result result = experienceInfoService.add ( experienceInfo );
        return ResponseEntity.ok ( result );
    }


}
