package service.employee;

import model.employee.Employee;

import java.util.List;

public interface IEmployee {
    void save(Employee employee);

    List<Employee> getAllEmployee();
    void remove(int id);
}
