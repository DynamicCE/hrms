package kodlamaio.hrms.business.services.profile.abstracts;

import org.springframework.stereotype.Service;

@Service
public
interface NotificationService {
    public
    void turnNotificationOn ( int id );

    public
    void turnNotificationOff ( int id );
}
