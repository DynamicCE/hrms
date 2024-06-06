package kodlamaio.hrms.core.adapter;

import kodlamaio.hrms.core.result.DataResult;
import org.springframework.web.multipart.MultipartFile;

public
interface CloudinaryAdapter {
    DataResult<String> uploadFile( MultipartFile file);
}
