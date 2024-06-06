package kodlamaio.hrms.core.adapter;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import kodlamaio.hrms.core.result.DataResult;
import kodlamaio.hrms.core.result.ErrorDataResult;
import kodlamaio.hrms.core.result.SuccessDataResult;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Map;

@Service
public class CloudinaryAdapterManager implements CloudinaryAdapter {
    private final Cloudinary cloudinary;

    public CloudinaryAdapterManager(@Value("${cloudinary.cloud_name}") String cloudName,
                                    @Value("${cloudinary.api_key}") String apiKey,
                                    @Value("${cloudinary.api_secret}") String apiSecret) {
        this.cloudinary = new Cloudinary(ObjectUtils.asMap(
                "cloud_name", cloudName,
                "api_key", apiKey,
                "api_secret", apiSecret
        ));
    }

    @Override
    public
    DataResult<String> uploadFile( MultipartFile file) {
        try {
            Map uploadResult = cloudinary.uploader().upload(file.getBytes(), ObjectUtils.emptyMap());
            String url = uploadResult.get("url").toString();
            return new SuccessDataResult<> (url, "Fotoğrafınız yüklendi");
        } catch (IOException e) {
            return new ErrorDataResult<> (e.getMessage(), "Fotoğraf yüklenemedi");
        }
    }
}
