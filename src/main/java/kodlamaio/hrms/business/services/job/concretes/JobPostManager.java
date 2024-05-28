package kodlamaio.hrms.business.services.job.concretes;

import kodlamaio.hrms.business.services.job.abstracts.JobPostService;
import kodlamaio.hrms.core.*;
import kodlamaio.hrms.dataAccess.job.abstracts.JobPostDao;
import kodlamaio.hrms.entities.jobEntities.JobPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class JobPostManager implements JobPostService {
    private final JobPostDao jobPostDao;

    @Autowired
    public JobPostManager(JobPostDao jobPostDao) {
        this.jobPostDao = jobPostDao;
    }

    @Override
    public Result add(JobPost jobPost) {
        jobPostDao.save(jobPost);
        return new SuccessResult("JobPost eklendi");
    }

    @Override
    public DataResult<List<JobPost>> getAll() {
        return new SuccessDataResult<>(jobPostDao.findAll(), "İşlem başarılı");
    }

    @Override
    public Result delete(JobPost jobPost) {
        jobPostDao.delete(jobPost);
        return new SuccessResult("Başarıyla silindi");
    }

    @Override
    public DataResult<List<JobPost>> findByIsActive(Boolean isActive) {
        return new SuccessDataResult<>(jobPostDao.findByIsActive(isActive), "İşlem başarılı");
    }

    @Override
    public DataResult<List<JobPost>> findByIsActiveOrderByApplicationDeadline(Boolean isActive) {
        return new SuccessDataResult<>(jobPostDao.findByIsActiveOrderByApplicationDeadline(isActive), "İşlem başarılı");
    }

    @Override
    public DataResult<List<JobPost>> getAllActiveByEmployer(Long employerId) { // Long olarak değiştirin
        return new SuccessDataResult<>(jobPostDao.findByEmployerIdAndIsActive(employerId, true), "Firmaya ait tüm aktif iş ilanları listelendi.");
    }

    @Override
    public
    Result activateJobPost ( Long jobId ) {
        JobPost jobPost = jobPostDao.findById(jobId).orElse(null);
        if (jobPost != null) {
            jobPost.setActive(true);
            jobPostDao.save(jobPost);
            return new SuccessResult("İlan aktif hale getirildi.");
        }
        return new ErrorResult ("İlan bulunamadı.");
    }

    @Override
    public Result deactivateJobPost(Long jobId) {
        JobPost jobPost = jobPostDao.findById(jobId).orElse(null);
        if (jobPost != null) {
            jobPost.setActive(false);
            jobPostDao.save(jobPost);
            return new SuccessResult("İlan pasif hale getirildi.");
        }
        return new ErrorResult ("İlan bulunamadı.");
    }

    @Override
    public
    DataResult<List<JobPost>> findByApplicationDeadlineAfter ( LocalDate date ) {
        return new SuccessDataResult<> ( jobPostDao.findByApplicationDeadlineAfter ( date ),"filtreleme yapıldı" ) ;
    }


}
