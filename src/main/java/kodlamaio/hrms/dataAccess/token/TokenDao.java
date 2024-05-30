package kodlamaio.hrms.dataAccess.token;

import kodlamaio.hrms.entities.tokenEntity.VerificationToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public
interface TokenDao extends JpaRepository<VerificationToken,Long> {
    VerificationToken findByToken( String verificationToken);

    void delete ( String verificationToken );
}
