package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.entities.Employees;

public
interface EmployeeService {
    List<Employees> getAll( );
}
