package kodlamaio.hrms.business.services.abstracts;

import org.springframework.stereotype.Service;

@Service
public interface EmailVerificationService {
public boolean checkMail(String email);
}
