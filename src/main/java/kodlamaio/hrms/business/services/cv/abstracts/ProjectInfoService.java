package kodlamaio.hrms.business.services.cv.abstracts;

import kodlamaio.hrms.core.result.DataResult;
import kodlamaio.hrms.entities.cvEntities.ProjectInfo;

import java.util.List;

public interface ProjectInfoService {
    DataResult<List<ProjectInfo>> getAllByCandidateId(Long candidateId);
    DataResult<ProjectInfo> add(ProjectInfo projectInfo);
    DataResult<ProjectInfo> update(ProjectInfo projectInfo);
    DataResult<Void> delete(Long id);
}