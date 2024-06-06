package kodlamaio.hrms.business.services.cv.abstracts;

import kodlamaio.hrms.entities.cvEntities.LanguageInfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public
interface LanguageInfoService {
    void addLanguageInfo( LanguageInfo languageInfo);
    List<LanguageInfo> getAllLanguageInfos();
}
