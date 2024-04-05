package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.entities.userEntities.User;

import java.util.List;
import java.util.Optional;

public
interface UserService<T> {
    List<T> getAll();
    T get(Long id);
    T create(T entity);
    T update(Long id, T entity);
    void delete(Long id);
}
