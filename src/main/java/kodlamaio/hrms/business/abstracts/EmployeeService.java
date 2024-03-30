package kodlamaio.hrms.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.entities.userEntities.Employee;
@Service
public
interface EmployeeService {
    List<Employee> getAll( );
}
