package kodlamaio.hrms.business.abstracts;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.entities.userEntities.Employer;

@Service
public
interface EmployerService {

    List<Employer> getAll ();

    Optional<Employer> findById ( Long id );

    Employer create ( Employer foundEmployer );

    Employer update ( Employer foundEmployer );

    Employer delete (Employer employer);
}
