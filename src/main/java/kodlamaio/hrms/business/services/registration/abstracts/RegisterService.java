package kodlamaio.hrms.business.services.registration.abstracts;

import org.springframework.stereotype.Service;

@Service
public interface RegisterService {
 public void register(String email, String password, String confirmPassword, String firstName, String lastName);

}
