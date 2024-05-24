package kodlamaio.hrms.dataAccess;

import kodlamaio.hrms.entities.Token;
import org.springframework.data.jpa.repository.JpaRepository;

public
interface TokenDao extends JpaRepository<Token,Long> {
    Token findByToken(String token);
}
