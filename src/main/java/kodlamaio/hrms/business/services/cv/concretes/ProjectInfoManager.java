package kodlamaio.hrms.business.services.cv.concretes;

import kodlamaio.hrms.business.services.cv.abstracts.ProjectInfoService;
import kodlamaio.hrms.core.result.DataResult;
import kodlamaio.hrms.core.result.SuccessDataResult;
import kodlamaio.hrms.dataAccess.cvDao.ProjectInfoDao;
import kodlamaio.hrms.entities.cvEntities.ProjectInfo;
import kodlamaio.hrms.entities.dtos.cvDtos.ProjectInfoDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProjectInfoManager implements ProjectInfoService {

    private final ProjectInfoDao projectInfoDao;
    private final ModelMapper modelMapper;
    @Autowired
    public ProjectInfoManager( ProjectInfoDao projectInfoDao, ModelMapper modelMapper ) {
        this.projectInfoDao = projectInfoDao;
        this.modelMapper = modelMapper;
    }

    @Override
    public DataResult<List<ProjectInfo>> getAllByCandidateId(Long candidateId) {
        List<ProjectInfo> result = projectInfoDao.findAllByCandidateId(candidateId);
        return new SuccessDataResult<>(result, "Adayın proje bilgileri başarıyla getirildi.");
    }

    @Override
    public DataResult<ProjectInfo> add(ProjectInfo projectInfo) {
        ProjectInfo result = projectInfoDao.save(projectInfo);
        return new SuccessDataResult<>(result, "Proje bilgisi başarıyla eklendi.");
    }

    @Override
    public DataResult<ProjectInfo> update(ProjectInfo projectInfo) {
        ProjectInfo result = projectInfoDao.save(projectInfo);
        return new SuccessDataResult<>(result, "Proje bilgisi başarıyla güncellendi.");
    }

    @Override
    public DataResult<Void> delete(Long id) {
        projectInfoDao.deleteById(id);
        return new SuccessDataResult<>(null, "Proje bilgisi başarıyla silindi.");
    }

    @Override
    public DataResult<List<ProjectInfoDto>> getAllDtosByCandidateId(Long candidateId) {
        List<ProjectInfo> projectInfos = projectInfoDao.findAllByCandidateId(candidateId);
        List<ProjectInfoDto> projectInfoDtos = projectInfos.stream()
                .map(projectInfo -> modelMapper.map(projectInfo, ProjectInfoDto.class))
                .collect( Collectors.toList());
        return new SuccessDataResult<>(projectInfoDtos, "Project infos listed successfully");
    }

}