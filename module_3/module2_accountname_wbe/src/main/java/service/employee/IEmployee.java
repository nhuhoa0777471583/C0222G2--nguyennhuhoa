package service.employee;

import model.employee.Employee;

import java.util.List;

public interface IEmployee {
    List<Employee> getAllEmployee();
    void remove(int id);
}
