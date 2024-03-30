package kodlamaio.hrms.business.concretes;

import java.util.List;

import kodlamaio.hrms.business.abstracts.EmployeeService;
import kodlamaio.hrms.dataAccess.user.abstracts.UserDao;
import kodlamaio.hrms.entities.userEntities.Employee;
import org.springframework.stereotype.Service;

public
@Service
class EmployeeManager implements EmployeeService {
    UserDao userDao;

    public EmployeeManager(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<Employee> getAll() {
        userDao.findAll();
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }
}
