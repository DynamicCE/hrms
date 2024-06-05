package kodlamaio.hrms.business.services.cv.concretes;

import kodlamaio.hrms.dataAccess.cvDao.ProjectDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.services.cv.abstracts.ProjectService;

@Service
public class ProjectManager implements ProjectService {
    private
    ProjectDao projectDao;

    @Autowired

    public
    ProjectManager ( ProjectDao projectDao ) {
        this.projectDao = projectDao;
    }
}
