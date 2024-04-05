package kodlamaio.hrms.business.concretes;

import java.util.List;
import java.util.Optional;

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
    List getAll () {
        return userDao.findAll ( );
    }

    @Override
    public
    Object get ( Long id ) {
        return userDao.findById ( id );
    }

    @Override
    public
    Object create ( Object entity ) {
        userDao.save ( entity  );
    }

    @Override
    public
    Object update ( Long id, Object entity ) {
        return null;
    }

    @Override
    public
    void delete ( Long id ) {

    }
}
