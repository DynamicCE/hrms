package kodlamaio.hrms.business.services.profile.abstracts;

import org.springframework.stereotype.Service;

@Service
public interface LoginService {
public void login(String email, String password);
}
