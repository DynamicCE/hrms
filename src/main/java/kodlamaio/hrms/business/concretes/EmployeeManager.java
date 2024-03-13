package kodlamaio.hrms.business.concretes;

import java.util.List;

import kodlamaio.hrms.business.abstracts.EmployeeService;
import kodlamaio.hrms.dataAccess.abstracts.UserDao;
import kodlamaio.hrms.entities.Employees;

public
class EmployeeManager implements EmployeeService{
UserDao userDao;

    public
    EmployeeManager ( UserDao userDao ) {
        this.userDao = userDao;
    }

    @Override
    public List<Employees> getAll( ) {
        userDao.findAll ();
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }
     
}
