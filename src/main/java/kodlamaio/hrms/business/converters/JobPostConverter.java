package kodlamaio.hrms.business.converters;

import kodlamaio.hrms.entities.dtos.JobPostDto;
import kodlamaio.hrms.entities.jobEntities.JobPost;
import kodlamaio.hrms.entities.userEntities.Employer;
import org.springframework.stereotype.Component;

@Component
public
class JobPostConverter {
    public
    JobPostDto convertToDto( JobPost jobPost) {
        JobPostDto jobPostDto = new JobPostDto();
        jobPostDto.setJobTitle(jobPost.getJobTitle());
        jobPostDto.setJobDescription(jobPost.getDescription());
        jobPostDto.setCompanyName(jobPost.getEmployer().getCompanyName());
        jobPostDto.setCity(jobPost.getCity());
        jobPostDto.setMinSalary(jobPost.getMinSalary());
        jobPostDto.setMaxSalary(jobPost.getMaxSalary());
        jobPostDto.setOpenPositions(jobPost.getNumOfPositions());
        jobPostDto.setApplicationDeadline(jobPost.getApplicationDeadline());
        jobPostDto.setPostedDate(jobPost.getPostedDate());
        return jobPostDto;
    }

    public JobPost convertToEntity(JobPostDto jobPostDto, Employer employer) {
        JobPost jobPost = new JobPost();
        jobPost.setJobTitle(jobPostDto.getJobTitle());
        jobPost.setDescription(jobPostDto.getJobDescription());
        jobPost.setCity(jobPostDto.getCity());
        jobPost.setMinSalary(jobPostDto.getMinSalary());
        jobPost.setMaxSalary(jobPostDto.getMaxSalary());
        jobPost.setNumOfPositions(jobPostDto.getOpenPositions());
        jobPost.setApplicationDeadline(jobPostDto.getApplicationDeadline());
        jobPost.setEmployer(employer);
        return jobPost;
    }
}
