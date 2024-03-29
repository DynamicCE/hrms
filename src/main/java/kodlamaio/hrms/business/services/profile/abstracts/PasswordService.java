package kodlamaio.hrms.business.services.profile.abstracts;

import org.springframework.stereotype.Service;

@Service
public interface PasswordService {
    public void updatePassword(int id, String password);
}
