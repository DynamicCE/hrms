package kodlamaio.hrms.business.services.systemConfigurations.abstracts;

import kodlamaio.hrms.core.result.DataResult;
import kodlamaio.hrms.core.result.Result;
import kodlamaio.hrms.dataAccess.systemConfigurationsDao.ProfileCoverLetterDao;
import kodlamaio.hrms.entities.systemConfigurationsEntities.ProfileCoverLetter;
import kodlamaio.hrms.entities.userEntities.Candidate;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public
interface ProfileCoverLetterService {
    Result add(Long candidateId , String profileCoverLetter);
    DataResult<ProfileCoverLetter> updateProfileCoverLetter(Long coverLetterId, String content);
    DataResult<ProfileCoverLetter> getById(Long profileCoverLetterId  );
    DataResult<List<ProfileCoverLetter>> getAllProfileCoverLetters();
    Result deleteProfileCoverLetter(Long coverLetterId);
}
