package kodlamaio.hrms.business.services.systemConfigurations.concretes;
import kodlamaio.hrms.business.services.systemConfigurations.abstracts.CloudinaryService;
import kodlamaio.hrms.core.adapter.CloudinaryAdapter;
import kodlamaio.hrms.core.result.DataResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


@Service
public
class CloudinaryManager implements CloudinaryService {
    private final CloudinaryAdapter cloudinaryAdapter;

    @Autowired
    public CloudinaryManager( CloudinaryAdapter cloudinaryAdapter) {
        this.cloudinaryAdapter = cloudinaryAdapter;
    }

    @Override
    public DataResult<String> uploadFile(MultipartFile file) {
        return cloudinaryAdapter.uploadFile(file);
    }
}
