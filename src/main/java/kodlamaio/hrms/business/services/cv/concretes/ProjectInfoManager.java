package kodlamaio.hrms.business.services.cv.concretes;

import kodlamaio.hrms.business.services.cv.abstracts.ProjectInfoService;
import kodlamaio.hrms.core.result.DataResult;
import kodlamaio.hrms.core.result.SuccessDataResult;
import kodlamaio.hrms.dataAccess.cvDao.ProjectInfoDao;
import kodlamaio.hrms.entities.cvEntities.ProjectInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectInfoManager implements ProjectInfoService {

    private final ProjectInfoDao projectInfoDao;

    @Autowired
    public ProjectInfoManager(ProjectInfoDao projectInfoDao) {
        this.projectInfoDao = projectInfoDao;
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
}