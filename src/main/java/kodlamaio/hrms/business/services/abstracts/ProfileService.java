package kodlamaio.hrms.business.services.abstracts;

import org.apache.catalina.User;

public interface ProfileService {
User getProfile(int id);
User updateProfile(int id, User user); // id user'ı bulur, user ise güncellenmiş user'ı içerir.Bu user'ı db'deki userla değiştirecek kodu yazmak lazım
}
