package kodlamaio.hrms.business.services.common.concretes;

import kodlamaio.hrms.business.services.common.abstracts.SchoolService;
import kodlamaio.hrms.core.DataResult;
import kodlamaio.hrms.core.Result;
import kodlamaio.hrms.core.SuccessDataResult;
import kodlamaio.hrms.core.SuccessResult;
import kodlamaio.hrms.dataAccess.common.SchoolDao;
import kodlamaio.hrms.entities.commonEntities.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public
class SchoolManager implements SchoolService {
    private final SchoolDao schoolDao;

    @Autowired
    public
    SchoolManager ( SchoolDao schoolDao ) {
        this.schoolDao = schoolDao;
    }

    @Override
    public
    Result addSchool ( School school ) {
        schoolDao.save(school);
        return new SuccessResult ("School added successfully");
    }

    @Override
    public
    DataResult<List<School>> getSchoolsByCandidate ( Long candidateId ) {
        List<School> schools = schoolDao.findByCandidateIdOrderByGraduationYearDesc(candidateId);
        return new SuccessDataResult<> (schools, "Schools listed successfully");
    }
}
