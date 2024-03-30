package kodlamaio.hrms.dataAccess.abstracts;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository 
public interface UserDao extends JpaRepository<User, Integer>{

}
