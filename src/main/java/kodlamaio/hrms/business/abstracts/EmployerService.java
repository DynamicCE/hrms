package kodlamaio.hrms.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.entities.userEntities.Employer;

@Service
public interface EmployerService {

    List<Employer> getAll( );
}
