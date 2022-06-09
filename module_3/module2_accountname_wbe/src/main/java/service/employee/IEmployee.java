package service.employee;

import model.employee.Employee;

import java.util.List;

public interface IEmployee {
    void save(Employee employee);

    List<Employee> getAllEmployee();

    void deleteEmployee(Integer id);
    Employee findById(Integer id);


    void update(Employee employeeUpdate);

    List<Employee> searchNameEmployee(String nameSearch);
}
