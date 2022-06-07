package repository.employee;

import model.employee.Employee;

import java.util.List;

public interface IEmployyeRepository {
     List<Employee> getAllEmployee();
     void save(Employee employee);
     void remove(int id);
}
