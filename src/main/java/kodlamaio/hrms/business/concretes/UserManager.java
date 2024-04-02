package kodlamaio.hrms.business.concretes;

import java.util.List;

import kodlamaio.hrms.entities.userEntities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.UserService;
import kodlamaio.hrms.dataAccess.user.abstracts.UserDao;
@Service
public
class UserManager implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public
    List<User> getAll () {
        return userDao.findAll ();
    }
}
