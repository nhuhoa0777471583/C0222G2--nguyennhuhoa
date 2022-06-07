package service.employee.impl;

import model.employee.Employee;
import repository.employee.IEmployyeRepository;
import repository.employee.imlp.EmployeeRepositoryImpl;
import service.employee.IEmployee;

import java.util.List;

public class EmployeeServiceImpl implements IEmployee {
    private IEmployyeRepository iEmployye = new EmployeeRepositoryImpl();

    @Override
    public void save(Employee employee) {
        this.iEmployye.save(employee);
    }

    @Override
    public List<Employee> getAllEmployee() {
        return iEmployye.getAllEmployee();
    }

    @Override
    public void remove(int id) {
        this.iEmployye.remove(id);
    }

}
