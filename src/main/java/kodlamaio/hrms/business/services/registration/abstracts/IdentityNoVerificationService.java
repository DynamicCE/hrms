package kodlamaio.hrms.business.services.registration.abstracts;

import org.springframework.stereotype.Service;

@Service
public interface IdentityNoVerificationService {
public boolean checkIdentityNo(int identityNo);
}
