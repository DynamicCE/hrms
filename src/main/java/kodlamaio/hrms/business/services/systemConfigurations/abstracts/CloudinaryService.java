package kodlamaio.hrms.business.services.systemConfigurations.abstracts;

import kodlamaio.hrms.core.result.DataResult;
import org.springframework.web.multipart.MultipartFile;

public
interface CloudinaryService {
    DataResult<String> uploadFile(MultipartFile file);
}
