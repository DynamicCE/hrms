package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.entities.userEntities.Employee;

public
interface EmployeeService {
    List<Employee> getAll( );
}
