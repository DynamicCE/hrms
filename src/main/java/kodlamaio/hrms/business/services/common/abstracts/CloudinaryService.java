package kodlamaio.hrms.business.services.common.abstracts;

import kodlamaio.hrms.core.DataResult;
import kodlamaio.hrms.core.Result;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public
interface CloudinaryService {
    DataResult uploadFile( MultipartFile file);
}
