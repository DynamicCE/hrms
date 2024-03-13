package kodlamaio.hrms.business.services.abstracts;

import org.apache.catalina.User;

public interface ProfileService {
User getProfile(int id);
User updateProfile(int id, User user); 
boolean deleteProfile(int id);
}
