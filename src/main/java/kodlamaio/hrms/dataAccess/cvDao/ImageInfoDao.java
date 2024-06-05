package kodlamaio.hrms.dataAccess.cvDao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kodlamaio.hrms.entities.cvEntities.ImageInfo;

@Repository
public interface ImageInfoDao extends JpaRepository<ImageInfo, Long> {
}
