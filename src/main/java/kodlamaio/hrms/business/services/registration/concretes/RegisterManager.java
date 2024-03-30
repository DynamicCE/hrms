package kodlamaio.hrms.business.services.registration.concretes;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.services.registration.abstracts.RegisterService;
@Service
public class RegisterManager implements RegisterService{

    @Override
    public void register(String email, String password, String confirmPassword, String firstName, String lastName) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'register'");
    }

}
