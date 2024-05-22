package kodlamaio.hrms.business.services.job.concretes;

import kodlamaio.hrms.business.services.job.abstracts.JobPostService;
import kodlamaio.hrms.core.DataResult;
import kodlamaio.hrms.core.Result;
import kodlamaio.hrms.core.SuccessDataResult;
import kodlamaio.hrms.core.SuccessResult;
import kodlamaio.hrms.dataAccess.job.abstracts.JobPostDao;
import kodlamaio.hrms.entities.jobEntities.JobPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public
class JobPostManager implements JobPostService {
    private
    JobPostDao jobPostDao;
    @Autowired
    public
    JobPostManager ( JobPostDao jobPostDao ) {
        this.jobPostDao = jobPostDao;
    }

    @Override
    public
    Result add ( JobPost jobPost ) {
        jobPostDao.save ( jobPost );
        return new SuccessResult ( "JobPost eklendi" );
    }

    @Override
    public
    DataResult<List<JobPost>> getAll () {
        return new SuccessDataResult<List<JobPost>> ( jobPostDao.findAll (),"İşlem başarılı" );

    }

    @Override
    public
    Result delete (JobPost jobPost) {
        jobPostDao.delete ( jobPost );
        return new SuccessResult ( "başarıyla silindi" );
    }

    @Override
    public
    DataResult<List<JobPost>> findByIsActive ( Boolean isActive ) {
        return new SuccessDataResult<List<JobPost>> ( jobPostDao.findByIsActive ( isActive ),"İşlem başarılı" );
    }

    @Override
    public
    DataResult<List<JobPost>> findByIsActiveOrderByApplicationDeadline ( Boolean isActive ) {
        return new SuccessDataResult<List<JobPost>> (jobPostDao.findByIsActiveOrderByApplicationDeadline ( isActive ),"İşlem başarılı"  );
    }


}
