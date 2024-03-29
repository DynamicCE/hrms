package kodlamaio.hrms.business.services.abstracts;

import org.springframework.stereotype.Service;

@Service
public interface PasswordService {
    public void updatePassword(int id, String password);
}
