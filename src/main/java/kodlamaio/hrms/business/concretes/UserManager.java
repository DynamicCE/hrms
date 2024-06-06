package kodlamaio.hrms.business.concretes;

import java.util.List;

import kodlamaio.hrms.core.result.DataResult;
import kodlamaio.hrms.core.result.SuccessDataResult;
import kodlamaio.hrms.entities.userEntities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.UserService;
import kodlamaio.hrms.dataAccess.user.abstracts.UserDao;

@Service
public class UserManager implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public
    DataResult<User> findByEmail ( String email ) {
        return new SuccessDataResult<User> (userDao.findByEmail ( email),"işlem başarılı"  );
    }

    @Override
    public
    DataResult<User> add ( User user ) {
        return new SuccessDataResult<> ( userDao.save ( user ),"başarıyla eklendi" );
    }

    @Override
    public
    DataResult<List<User>> findByEmailContains ( String email ) {
        return new SuccessDataResult<List<User>> (userDao.findByEmailContains ( email ),"işlem başarılı");
    }

    @Override
    public
    DataResult<List<User>> findByEmailStartsWith ( String email ) {
        return new SuccessDataResult<List<User>> ( userDao.findByEmailStartsWith ( email ),"işlem başarılı" );
    }

    @Override
    public
    DataResult<List<User>> findByEmailEndsWith ( String email ) {
        return new SuccessDataResult<List<User>> ( userDao.findByEmailEndsWith ( email),"işlem başarılı"  );
    }


}
