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
}
