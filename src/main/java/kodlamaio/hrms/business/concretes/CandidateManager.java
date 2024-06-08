package kodlamaio.hrms.business.concretes;

import java.util.List;

import kodlamaio.hrms.business.services.cv.abstracts.*;
import kodlamaio.hrms.business.services.email.abstracts.EmailVerificationService;
import kodlamaio.hrms.business.services.token.abstracts.TokenService;
import kodlamaio.hrms.core.result.*;
import kodlamaio.hrms.dataAccess.user.abstracts.CandidateDao;
import kodlamaio.hrms.entities.dtos.cvDtos.CandidateCvDto;
import kodlamaio.hrms.entities.tokenEntities.VerificationToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.CandidateService;


import kodlamaio.hrms.entities.userEntities.Candidate;
@Service
public
class CandidateManager implements CandidateService{

    private final CandidateDao candidateDao;
    private final EmailVerificationService emailVerificationService;
    private final TokenService tokenService;
    private final EducationInfoService educationInfoService;
    private final ExperienceInfoService experienceInfoService;
    private final LanguageInfoService languageInfoService;
    private final ProjectInfoService projectInfoService;
    private final TalentInfoService talentInfoService;
    private final CoverLetterInfoService coverLetterInfoService;
    private final ImageInfoService imageInfoService;

    @Autowired
    public CandidateManager(CandidateDao candidateDao,
                            EmailVerificationService emailVerificationService,
                            TokenService tokenService,
                            EducationInfoService educationInfoService,
                            ExperienceInfoService experienceInfoService,
                            LanguageInfoService languageInfoService,
                            ProjectInfoService projectInfoService,
                            TalentInfoService talentInfoService,
                            CoverLetterInfoService coverLetterInfoService,
                            ImageInfoService imageInfoService) {
        this.candidateDao = candidateDao;
        this.emailVerificationService = emailVerificationService;
        this.tokenService = tokenService;
        this.educationInfoService = educationInfoService;
        this.experienceInfoService = experienceInfoService;
        this.languageInfoService = languageInfoService;
        this.projectInfoService = projectInfoService;
        this.talentInfoService = talentInfoService;
        this.coverLetterInfoService = coverLetterInfoService;
        this.imageInfoService = imageInfoService;
    }

    @Override
    public
    DataResult<List<Candidate>> getAll() {
        return new SuccessDataResult<List<Candidate>> ( candidateDao.findAll (),"işlem başarılı" );
    }

    @Override
    public
    Result register( Candidate candidate) {
        if (candidateDao.existsByEmail(candidate.getEmail()) || candidateDao.existsByIdentityNo(candidate.getIdentityNo())) {
            return new ErrorResult ("zaten kayıtlısınız");
        }
        boolean mernis = fakeMernisVerification(candidate);
        if (!mernis) {
            return new ErrorResult("doğrulama başarısız");
        }
        candidateDao.save(candidate);
        tokenService.createToken(candidate.getEmail());
        return new SuccessResult ("başarıyla kaydoldunuz, e-postanızı kontrol ediniz");
    }

    @Override
    public boolean verifyEmail(String token) {
        DataResult<VerificationToken> result = tokenService.validateToken(token);
        if (result.isSuccess()) {
            tokenService.delete(result.getData().getToken()); // Token doğrulandıktan sonra sil
            return true;
        }
        return false;
    }

    @Override
    public Result addPhotoUrl(Long candidateId, String url) {
        Candidate candidate = candidateDao.findById(candidateId).orElse(null);
        if (candidate == null) {
            return new ErrorResult("Aday bulunamadı");
        }
        candidate.setPhotoUrl(url);
        candidateDao.save(candidate);
        return new SuccessResult("Fotoğraf başarıyla eklendi");
    }

    @Override
    public Result updateGithubAddress(Long candidateId, String githubAddress) {
        Candidate candidate = candidateDao.findById(candidateId).orElse(null);
        if (candidate == null) {
            return new ErrorResult("Aday bulunamadı");
        }
        candidate.setGithubAddress(githubAddress);
        candidateDao.save(candidate);
        return new SuccessResult("GitHub adresi başarıyla güncellendi");
    }

    @Override
    public
    Result updateLinkedinAddress ( Long candidateId, String linkedinAddress ) {
        Candidate candidate = candidateDao.findById ( candidateId ).orElse ( null );
        if(candidate==null){
            return new ErrorResult("Aday bulunamadı");
        }
        candidate.setLinkedinAddress ( linkedinAddress );
        candidateDao.save ( candidate );
        return new SuccessResult("LinkedIn adresi başarıyla güncellendi");
    }

    @Override
    public DataResult<CandidateCvDto> getCandidateCv(Long candidateId) {
        Candidate candidate = candidateDao.findById(candidateId)
                .orElseThrow(() -> new ResourceNotFoundException("Candidate not found with id: " + candidateId));
        CandidateCvDto candidateCvDto = new CandidateCvDto();
        candidateCvDto.setFirstName(candidate.getFirstName());
        candidateCvDto.setLastName(candidate.getLastName());
        candidateCvDto.setEmail(candidate.getEmail());
        candidateCvDto.setEducationInfos(educationInfoService.getAllDtosByCandidateId(candidateId).getData());
        candidateCvDto.setExperienceInfos(experienceInfoService.getAllDtosByCandidateId(candidateId).getData());
        candidateCvDto.setLanguageInfos(languageInfoService.getAllDtosByCandidateId(candidateId).getData());
        candidateCvDto.setProjectInfos(projectInfoService.getAllDtosByCandidateId(candidateId).getData());
        candidateCvDto.setTalentInfos(talentInfoService.getAllDtosByCandidateId(candidateId).getData());
        candidateCvDto.setCoverLetterInfos(coverLetterInfoService.getAllDtosByCandidateId(candidateId).getData());
        candidateCvDto.setImageInfo(imageInfoService.getDtoByCandidateId(candidateId).getData());
        return new SuccessDataResult<>(candidateCvDto, "Candidate CV info retrieved successfully");
    }


    private boolean fakeMernisVerification(Candidate candidate){
        return true; //fake servis her zaman başarılı
    }


}
