package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.entities.userEntities.User;

import java.util.List;
import java.util.Optional;

public
interface UserService {
    List<User> getAll();
    Optional<User> findById ( Long id);
    User createUser( User user );
    User updateUser(User user);
    void deleteUser(Long id);
}
