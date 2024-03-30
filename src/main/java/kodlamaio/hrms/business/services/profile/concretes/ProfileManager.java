package kodlamaio.hrms.business.services.profile.concretes;

import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.services.profile.abstracts.ProfileService;
@Service
public class ProfileManager implements ProfileService{

    @Override
    public User getProfile(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getProfile'");
    }

    @Override
    public User updateProfile(int id, User user) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateProfile'");
    }

    @Override
    public boolean deleteProfile(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteProfile'");
    }

}
