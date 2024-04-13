package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.entities.userEntities.User;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public
interface UserService {
    List<User> getAll();
    Optional<User> findById(Long id);
    User updateUser(User user);
    User createUser( User user);

    void deleteUser ( User user );
}
