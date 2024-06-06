package kodlamaio.hrms.business.services.common.concretes;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import kodlamaio.hrms.business.services.common.abstracts.CloudinaryService;
import kodlamaio.hrms.core.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Map;

public
class CloudinaryManager implements CloudinaryService {
    private final Cloudinary cloudinary;
    public CloudinaryManager(@Value("${cloudinary.cloud_name}") String cloudName,
                             @Value("${cloudinary.api_key}") String apiKey,
                             @Value("${cloudinary.api_secret}") String apiSecret) {
        this.cloudinary = new Cloudinary( ObjectUtils.asMap(
                "cloud_name", cloudName,
                "api_key", apiKey,
                "api_secret", apiSecret
        ));
    }
    @Override
    public
    DataResult uploadFile ( MultipartFile file ) {
        try {
            Map uploadResult = cloudinary.uploader().upload(file.getBytes(), ObjectUtils.emptyMap());
            String url = uploadResult.get("url").toString();
            return new SuccessDataResult (url,"fotoğrafınız yüklendi");
        } catch (IOException e) {
            return new ErrorDataResult (e.getMessage (),"fotoğraf yüklenemedi");
        }
    }
}
