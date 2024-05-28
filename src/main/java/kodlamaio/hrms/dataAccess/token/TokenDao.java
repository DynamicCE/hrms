package kodlamaio.hrms.dataAccess.token;

import kodlamaio.hrms.entities.tokenEntity.Token;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public
interface TokenDao extends JpaRepository<Token,Long> {
    Token findByToken(String token);
}
