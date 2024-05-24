package kodlamaio.hrms.business.services.email.abstracts;

import org.springframework.stereotype.Service;

@Service
public
interface EmailVerificationService {
    public
    boolean checkMail ( String email );

    void createVerificationToken ( String email );

}
