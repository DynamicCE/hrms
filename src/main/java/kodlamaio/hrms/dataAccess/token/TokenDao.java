package kodlamaio.hrms.dataAccess.token;

import kodlamaio.hrms.entities.tokenEntities.VerificationToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public
interface TokenDao extends JpaRepository<VerificationToken,Long> {
    Optional<VerificationToken> findByToken( String verificationToken);
    void deleteByToken ( String verificationToken );
}
