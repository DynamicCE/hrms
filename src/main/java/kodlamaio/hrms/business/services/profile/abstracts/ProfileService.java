package kodlamaio.hrms.business.services.abstracts;

import org.apache.catalina.User;
import org.springframework.stereotype.Service;
@Service
public interface ProfileService {
User getProfile(int id);
User updateProfile(int id, User user); 
boolean deleteProfile(int id);
}
