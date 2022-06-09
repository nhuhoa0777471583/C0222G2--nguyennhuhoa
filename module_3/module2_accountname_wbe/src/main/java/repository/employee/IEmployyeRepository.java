package repository.employee;

import model.employee.Employee;

import java.util.List;

public interface IEmployyeRepository {
     List<Employee> getAllEmployee();
     void save(Employee employee);

     void deleteEmployee(Integer id);

     Employee findById(Integer id);

    void update(Employee employeeUpdate);

    List<Employee> searchNameEmployee(String nameSearch);
}
