package kodlamaio.hrms.business.services.job.concretes;

import kodlamaio.hrms.business.services.job.abstracts.JobTitleService;
import kodlamaio.hrms.core.DataResult;
import kodlamaio.hrms.core.Result;
import kodlamaio.hrms.core.SuccessDataResult;
import kodlamaio.hrms.core.SuccessResult;
import kodlamaio.hrms.dataAccess.job.abstracts.JobTitleDao;
import kodlamaio.hrms.entities.jobEntities.JobTitle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public
class JobTitleManager implements JobTitleService {
    private
    JobTitleDao jobTitleDao;
    @Autowired
    public
    JobTitleManager ( JobTitleDao jobTitleDao ) {
        this.jobTitleDao = jobTitleDao;
    }

    @Override
    public
    Result add ( JobTitle jobTitle ) {
        jobTitleDao.save ( jobTitle );
        return new SuccessResult ( "JobTitle eklendi" );
    }

    @Override
    public
    DataResult<List<JobTitle>> getAll () {
        return new SuccessDataResult<List<JobTitle>> (jobTitleDao.findAll (),"işlem başarılı"  );
    }

    @Override
    public
    Result delete ( JobTitle jobTitle ) {
        jobTitleDao.delete ( jobTitle );
        return new SuccessResult ( "başarıyla silindi" );
    }
}
