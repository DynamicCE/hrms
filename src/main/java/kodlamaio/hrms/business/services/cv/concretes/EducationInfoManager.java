package kodlamaio.hrms.business.services.cv.concretes;

import kodlamaio.hrms.business.services.cv.abstracts.EducationInfoService;
import kodlamaio.hrms.core.result.DataResult;
import kodlamaio.hrms.core.result.SuccessDataResult;
import kodlamaio.hrms.dataAccess.cvDao.EducationInfoDao;
import kodlamaio.hrms.entities.cvEntities.EducationInfo;
import kodlamaio.hrms.entities.dtos.cvDtos.EducationInfoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EducationInfoManager implements EducationInfoService {

    private final EducationInfoDao educationInfoDao;

    @Autowired
    public EducationInfoManager(EducationInfoDao educationInfoDao) {
        this.educationInfoDao = educationInfoDao;
    }

    @Override
    public DataResult<List<EducationInfo>> getAll() {
        List<EducationInfo> result = educationInfoDao.findAll();
        return new SuccessDataResult<>(result, "Tüm eğitim bilgileri başarıyla getirildi.");
    }

    @Override
    public DataResult<EducationInfo> add(EducationInfo educationInfo) {
        EducationInfo result = educationInfoDao.save(educationInfo);
        return new SuccessDataResult<>(result, "Eğitim bilgisi başarıyla eklendi.");
    }

    @Override
    public DataResult<EducationInfo> update(EducationInfo educationInfo) {
        EducationInfo result = educationInfoDao.save(educationInfo);
        return new SuccessDataResult<>(result, "Eğitim bilgisi başarıyla güncellendi.");
    }

    @Override
    public DataResult<Void> delete(Long id) {
        educationInfoDao.deleteById(id);
        return new SuccessDataResult<>(null, "Eğitim bilgisi başarıyla silindi.");
    }

    @Override
    public DataResult<List<EducationInfo>> getAllByCandidateId(Long candidateId) {
        List<EducationInfo> educationInfos = educationInfoDao.findAllByCandidateIdOrderByGraduationYearDesc(candidateId);
        for (EducationInfo info : educationInfos) {
            if (info.getGraduationYear() == null) {
                info.setGraduationYear(Integer.MAX_VALUE);
                info.setSchoolStatus("Devam Ediyor");
            }
        }
        return new SuccessDataResult<>(educationInfos, "Eğitim bilgileri getirildi");
    }

    @Override
    public DataResult<List<EducationInfoDto>> getAllDtosByCandidateId(Long candidateId) {
        List<EducationInfo> educationInfos = educationInfoDao.findByCandidateId(candidateId);
        List<EducationInfoDto> educationInfoDtos = educationInfos.stream()
                .map(educationInfo -> new EducationInfoDto(educationInfo.getId(), educationInfo.getSchoolName(), educationInfo.getDegree(), educationInfo.getFieldOfStudy(), educationInfo.getStartDate(), educationInfo.getEndDate()))
                .collect( Collectors.toList());
        return new SuccessDataResult<>(educationInfoDtos, "Eğitim bilgileri getirildi");
    }


}