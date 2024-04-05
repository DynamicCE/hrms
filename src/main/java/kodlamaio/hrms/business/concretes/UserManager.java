package kodlamaio.hrms.business.concretes;

import java.util.List;
import java.util.Optional;

import kodlamaio.hrms.entities.userEntities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.UserService;
import kodlamaio.hrms.dataAccess.user.abstracts.UserDao;

@Service
public class UserManager implements UserService<User> {
    @Autowired
    private UserDao userDao;


    @Override
    public
    List<User> getAll () {
        return null;
    }

    @Override
    public
    User get ( Long id ) {
        return null;
    }

    @Override
    public
    User create ( User entity ) {
        return userDao.save ( entity );
    }

    @Override
    public
    User update ( Long id, User entity ) {
        User foundUser = userDao.findByEmail ( entity.getEmail () );
        if(foundUser != null){
            foundUser.setPassword ( entity.getPassword ());
            userDao.save ( foundUser );
            return foundUser;
        }
        return userDao.save ( entity );
    }

    @Override
    public
    void delete ( Long id ) {

    }
}
