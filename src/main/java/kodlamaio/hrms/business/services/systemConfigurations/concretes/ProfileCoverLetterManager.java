package kodlamaio.hrms.business.services.systemConfigurations.concretes;

import kodlamaio.hrms.business.services.systemConfigurations.abstracts.ProfileCoverLetterService;
import kodlamaio.hrms.core.result.*;
import kodlamaio.hrms.dataAccess.systemConfigurationsDao.ProfileCoverLetterDao;
import kodlamaio.hrms.entities.systemConfigurationsEntities.ProfileCoverLetter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public
class ProfileCoverLetterManager implements ProfileCoverLetterService {
    ProfileCoverLetterDao profileCoverLetterDao;
    @Autowired
    public
    ProfileCoverLetterManager ( ProfileCoverLetterDao profileCoverLetterDao ) {
        this.profileCoverLetterDao = profileCoverLetterDao;
    }



    @Override
    public
    Result add ( Long candidateId, String profileCoverLetter ) {
        return new SuccessResult ( "Profil yazınız başarıyla eklendi" );
    }

    @Override
    public
    DataResult<ProfileCoverLetter> updateProfileCoverLetter ( Long coverLetterId, String content ) {
        Optional<ProfileCoverLetter> profileCoverLetterOptional = profileCoverLetterDao.findById ( coverLetterId );
        if (!profileCoverLetterOptional.isPresent()) {
            return new ErrorDataResult<> ( null,"Profil yazınız bulunamadı" );
        }
        ProfileCoverLetter profileCoverLetter = profileCoverLetterOptional.get ();
        profileCoverLetterDao.save ( profileCoverLetter );
        return new SuccessDataResult<> ( profileCoverLetter,"Profil yazınız başarıyla güncellendi" );
    }

    @Override
    public
    DataResult<ProfileCoverLetter> getById ( Long profileCoverLetterId ) {
        Optional<ProfileCoverLetter> result = profileCoverLetterDao.findById ( profileCoverLetterId );
        return new SuccessDataResult<> ( result,"işlem başarılı" );
    }

    @Override
    public
    DataResult<List<ProfileCoverLetter>> getAllProfileCoverLetters () {
        return null;
    }

    @Override
    public
    Result deleteProfileCoverLetter ( Long coverLetterId ) {
        return null;
    }
}
