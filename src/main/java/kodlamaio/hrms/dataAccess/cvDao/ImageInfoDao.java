package kodlamaio.hrms.dataAccess.cvDao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kodlamaio.hrms.entities.cvEntities.ImageInfo;

import java.util.List;

@Repository
public interface ImageInfoDao extends JpaRepository<ImageInfo, Long> {
    List<ImageInfo> findAllByCandidateId( Long candidateId);
}
