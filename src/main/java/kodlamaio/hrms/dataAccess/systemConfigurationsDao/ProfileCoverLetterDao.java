package kodlamaio.hrms.dataAccess.systemConfigurationsDao;

import kodlamaio.hrms.entities.systemConfigurationsEntities.ProfileCoverLetter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public
interface ProfileCoverLetterDao extends JpaRepository<ProfileCoverLetter,Long> {
}
