package kodlamaio.hrms.dataAccess.user.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kodlamaio.hrms.entities.userEntities.User;


@Repository // jpa'yı extend ettiğimiz için repo anotasyonuna gerek yok , spring anlıyor
public interface UserDao extends JpaRepository<User, Long>{
    User findByEmail(String email);

}
    