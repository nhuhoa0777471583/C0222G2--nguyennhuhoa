package service.employee;

import model.employee.Employee;
import repository.employee.IEmployyeImpl;
import repository.employee.imlp.EmployeeRepository;

import java.util.List;

public class EmployeeService implements IEmployee {
    private IEmployyeImpl iEmployye = new EmployeeRepository();
    @Override
    public List<Employee> getAllEmployee() {
        return iEmployye.getAllEmployee();
    }

    @Override
    public void remove(int id) {
        this.iEmployye.remove(id);
    }

}
