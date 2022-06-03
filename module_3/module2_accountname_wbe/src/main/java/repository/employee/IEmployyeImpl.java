package repository.employee;

import controller.EmployeeServlet;
import model.Employee;

import java.util.List;

public interface IEmployyeImpl {
     List<Employee>  getAll();
      void save(Employee employee);
}
