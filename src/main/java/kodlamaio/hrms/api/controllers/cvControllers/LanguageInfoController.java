package kodlamaio.hrms.api.controllers.cvControllers;

import kodlamaio.hrms.business.services.cv.abstracts.LanguageInfoService;
import kodlamaio.hrms.entities.cvEntities.LanguageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/language/")
public
class LanguageInfoController {
    private LanguageInfoService languageInfoService;

    @Autowired
    public LanguageInfoController( LanguageInfoService languageInfoService) {
        this.languageInfoService = languageInfoService;
    }

    @PostMapping("/add")
    public
    ResponseEntity<?> addLanguageInfo( @RequestBody LanguageInfo languageInfo) {
        languageInfoService.addLanguageInfo(languageInfo);
        return ResponseEntity.ok("yabancı dil bilgileri eklendi");
    }

    @GetMapping("/list")
    public ResponseEntity<List<LanguageInfo>> getAllLanguageInfos() {
        List<LanguageInfo> languageInfos = languageInfoService.getAllLanguageInfos();
        return ResponseEntity.ok(languageInfos);
    }
}
