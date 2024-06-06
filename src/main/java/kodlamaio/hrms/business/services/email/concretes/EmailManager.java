package kodlamaio.hrms.business.services.email.concretes;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.services.email.abstracts.EmailService;
@Service
public class EmailManager implements EmailService{




    @Override
    public void sendEmail(String email, String message) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sendEmail'");
    }

    @Override
    public void sendVerificationEmail(String email, String token) {
        String verificationUrl = "http://localhost:8080/api/candidates/verify-email?token=" + token;
        String message = "E-postanızı doğrulamak için lütfen aşağıdaki bağlantıya tıklayın: " + verificationUrl;
        sendEmail(email, message);
    }
}
