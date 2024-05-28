package kodlamaio.hrms.business.abstracts;

import java.util.List;
import java.util.Optional;

import kodlamaio.hrms.core.DataResult;
import kodlamaio.hrms.core.Result;
import kodlamaio.hrms.entities.userEntities.Candidate;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.entities.userEntities.Employer;

@Service
public
interface EmployerService {

    DataResult<List<Employer>> getAll();
    DataResult<Optional<Employer>> findById(Long id);
    DataResult<Employer> create(Employer employer);
    DataResult<Employer> update(Employer employer);
    Result delete(Employer employer);
    Result register(Employer employer);
    Result approveEmployer(Long employerId);
}
