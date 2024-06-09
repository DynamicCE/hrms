package kodlamaio.hrms.api.controllers.cvControllers;

import kodlamaio.hrms.business.services.cv.abstracts.LanguageInfoService;
import kodlamaio.hrms.core.result.DataResult;
import kodlamaio.hrms.core.result.Result;
import kodlamaio.hrms.entities.cvEntities.LanguageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/languageinfos")
public class LanguageInfoController {

    private final LanguageInfoService languageInfoService;

    @Autowired
    public LanguageInfoController(LanguageInfoService languageInfoService) {
        this.languageInfoService = languageInfoService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody LanguageInfo languageInfo) {
        return this.languageInfoService.add(languageInfo);
    }

    @GetMapping("/all")
    public DataResult<List<LanguageInfo>> getAll(@RequestParam Long candidateId) {
        return this.languageInfoService.getAllByCandidateId(candidateId);
    }
}
