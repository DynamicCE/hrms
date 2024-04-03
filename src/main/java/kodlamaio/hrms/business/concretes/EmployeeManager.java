package kodlamaio.hrms.business.concretes;

import java.util.List;

import kodlamaio.hrms.business.abstracts.EmployeeService;
import kodlamaio.hrms.dataAccess.user.abstracts.EmployeeDao;
import kodlamaio.hrms.dataAccess.user.abstracts.UserDao;
import kodlamaio.hrms.entities.userEntities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public
@Service
class   EmployeeManager implements EmployeeService {
    @Autowired
    private
    EmployeeDao employeeDao;

    @Override
    public List<Employee> getAll() {
        employeeDao.findAll();
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }
}
