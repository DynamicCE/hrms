package kodlamaio.hrms.business.services.email.abstracts;

import org.springframework.stereotype.Service;

@Service
public interface EmailService {
public void sendEmail(String email, String message);
}
