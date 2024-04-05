package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.entities.userEntities.User;

import java.util.List;
import java.util.Optional;

public
interface UserService<T> {
    List<T> getAll();
    Optional<T> findById ( Long id);
    T saveUser(T entity);
    void deleteUser(Long id);
}
