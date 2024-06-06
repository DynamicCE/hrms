package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.result.DataResult;
import kodlamaio.hrms.entities.userEntities.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public
interface UserService {

    DataResult<User> findByEmail(String email);

    DataResult<User> add(User user);

    DataResult<List<User>> findByEmailContains ( String email );

    DataResult<List<User>> findByEmailStartsWith(String email);

    DataResult<List<User>> findByEmailEndsWith(String email);

}
