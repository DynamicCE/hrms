package kodlamaio.hrms.business.services.cv.abstracts;

import kodlamaio.hrms.core.result.DataResult;
import kodlamaio.hrms.entities.cvEntities.CertificationInfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public
interface CertificationInfoService {
    DataResult<List<CertificationInfo>> getAll();
    DataResult<CertificationInfo> add( CertificationInfo certificationInfo);
    DataResult<CertificationInfo> update(CertificationInfo certificationInfo);
    DataResult<Void> delete(Long id);
}
