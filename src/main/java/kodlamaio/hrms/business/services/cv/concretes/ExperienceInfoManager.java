package kodlamaio.hrms.business.services.cv.concretes;

import kodlamaio.hrms.business.services.cv.abstracts.ExperienceInfoService;
import kodlamaio.hrms.core.result.DataResult;
import kodlamaio.hrms.core.result.SuccessDataResult;
import kodlamaio.hrms.dataAccess.cvDao.ExperienceInfoDao;
import kodlamaio.hrms.entities.cvEntities.ExperienceInfo;
import kodlamaio.hrms.entities.dtos.cvDtos.ExperienceInfoDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ExperienceInfoManager implements ExperienceInfoService {

    private final ExperienceInfoDao experienceInfoDao;
    private final ModelMapper modelMapper;
    @Autowired
    public ExperienceInfoManager( ExperienceInfoDao experienceInfoDao, ModelMapper modelMapper ) {
        this.experienceInfoDao = experienceInfoDao;
        this.modelMapper = modelMapper;
    }

    @Override
    public
    DataResult<List<ExperienceInfo>> getAll () {
        return new SuccessDataResult<> (experienceInfoDao.findAll (),"hepsi getirldi"  );
    }

    @Override
    public DataResult<List<ExperienceInfo>> getAllByCandidateId(Long candidateId) {
        List<ExperienceInfo> result = experienceInfoDao.findAllByCandidateId(candidateId);
        return new SuccessDataResult<>(result, "Adayın deneyim bilgileri başarıyla getirildi.");
    }

    @Override
    public DataResult<ExperienceInfo> add(ExperienceInfo experienceInfo) {
        ExperienceInfo result = experienceInfoDao.save(experienceInfo);
        return new SuccessDataResult<>(result, "Deneyim bilgisi başarıyla eklendi.");
    }

    @Override
    public DataResult<ExperienceInfo> update(ExperienceInfo experienceInfo) {
        ExperienceInfo result = experienceInfoDao.save(experienceInfo);
        return new SuccessDataResult<>(result, "Deneyim bilgisi başarıyla güncellendi.");
    }

    @Override
    public DataResult<Void> delete(Long id) {
        experienceInfoDao.deleteById(id);
        return new SuccessDataResult<>(null, "Deneyim bilgisi başarıyla silindi.");
    }

    @Override
    public DataResult<List<ExperienceInfo>> getAllByCandidateIdOrderByEndYearDesc(Long candidateId) {
        List<ExperienceInfo> experienceInfos = experienceInfoDao.findAllByCandidateIdOrderByEndYearDesc(candidateId);
        for (ExperienceInfo info : experienceInfos) {
            if (info.getEndYear() == null) {
                info.setEndYear(Integer.MAX_VALUE);
            }
        }
        return new SuccessDataResult<>(experienceInfos, "Adayın deneyim bilgileri bitiş yılına göre listelendi");
    }

    @Override
    public DataResult<List<ExperienceInfoDto>> getAllDtosByCandidateId(Long candidateId) {
        List<ExperienceInfo> experienceInfos = experienceInfoDao.findAllByCandidateId(candidateId);
        List<ExperienceInfoDto> experienceInfoDtos = experienceInfos.stream()
                .map(experienceInfo -> modelMapper.map(experienceInfo, ExperienceInfoDto.class))
                .collect( Collectors.toList());
        return new SuccessDataResult<>(experienceInfoDtos, "Experience infos listed successfully");
    }

}