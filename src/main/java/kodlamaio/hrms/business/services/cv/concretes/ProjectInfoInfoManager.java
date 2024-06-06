package kodlamaio.hrms.business.services.cv.concretes;

import kodlamaio.hrms.dataAccess.cvDao.ProjectInfoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.services.cv.abstracts.ProjectInfoService;

@Service
public class ProjectInfoInfoManager implements ProjectInfoService {
    private
    ProjectInfoDao projectInfoDao;

    @Autowired

    public
    ProjectInfoInfoManager ( ProjectInfoDao projectInfoDao ) {
        this.projectInfoDao = projectInfoDao;
    }
}
