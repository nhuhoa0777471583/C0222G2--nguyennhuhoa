package repository.employee.imlp;

import model.employee.Employee;
import repository.BaseRepository;
import repository.employee.IEmployyeImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmployeeRepository implements IEmployyeImpl {
    private BaseRepository baseRepository = new BaseRepository();

    @Override
    public List<Employee> getAllEmployee() {
        List<Employee> employees = new ArrayList<>();
        Connection connection = this.baseRepository.getConnectionJavaTODB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from employee");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
//  id_employee  int primary key,name_employee varchar(100),birthday_employee date,id_card_employee varchar(50),
//  salary double,phone varchar(50),email varchar(50),address varchar(50),
//  id_position int,id_education_degree int,id_division int, username varchar(255),
                Integer id = resultSet.getInt("id_employee");
                String name = resultSet.getString("name_employee");
                String birthday = resultSet.getString("birthday_employee");
                String idCard = resultSet.getString("id_card_employee");
                Double salary = resultSet.getDouble("salary");
                String phone = resultSet.getString("phone");
                String email = resultSet.getString("email");
                String address = resultSet.getString("address");
                Integer idPosition = resultSet.getInt("id_position");
                Integer idEducationDegree = resultSet.getInt("id_education_degree");
                Integer idDivision = resultSet.getInt("id_division");
//                String userName = resultSet.getString("username");
                employees.add(new Employee
                (id,name,birthday,idCard,salary,phone,email,address,idPosition,idEducationDegree,idDivision));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return employees;
    }

    @Override
    public void save(Employee employee) {

    }

    @Override
    public void remove(int id) {

    }
}
