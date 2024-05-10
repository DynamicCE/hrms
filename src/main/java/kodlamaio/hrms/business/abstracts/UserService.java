package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.DataResult;
import kodlamaio.hrms.entities.userEntities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public
interface UserService {

    DataResult<User> findByEmail(String email);

    DataResult<List<User>> findByUserName( String userName);

    DataResult<List<User>> findByUserNameContains(String userName);

    DataResult<List<User>> findByUserNameStartsWith(String userName);

    DataResult<List<User>> findByUserNameEndsWith(String userName);
}
