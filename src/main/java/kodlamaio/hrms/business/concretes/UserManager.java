package kodlamaio.hrms.business.concretes;

import java.util.List;
import java.util.Optional;

import kodlamaio.hrms.core.DataResult;
import kodlamaio.hrms.core.SuccessDataResult;
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
        return new SuccessDataResult<User> ( userDao.findByEmail ( email),"işlem başarılı"  );
    }

    @Override
    public
    DataResult<List<User>> findByUserName ( String userName ) {
        return new SuccessDataResult<List<User>> ( userDao.findByUserName ( userName),"işlem başarılı" );
    }

    @Override
    public
    DataResult<List<User>> findByUserNameContains ( String userName ) {
        return new SuccessDataResult<List<User>> ( userDao.findByUserNameContains ( userName ),"işlem başarılı" );
    }

    @Override
    public
    DataResult<List<User>> findByUserNameStartsWith ( String userName ) {
        return new SuccessDataResult<List<User>> (userDao.findByUserNameStartsWith ( userName ),"işlem başarılı"  );
    }

    @Override
    public
    DataResult<List<User>> findByUserNameEndsWith ( String userName ) {
        return new SuccessDataResult<List<User>> ( userDao.findByUserNameEndsWith ( userName),"işlem başarılı"  );
    }
}
