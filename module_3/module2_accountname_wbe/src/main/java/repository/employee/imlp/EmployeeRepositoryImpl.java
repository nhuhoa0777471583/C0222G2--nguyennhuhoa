package repository.employee.imlp;

import model.employee.Employee;
import repository.BaseRepository;
import repository.employee.IEmployyeRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImpl implements IEmployyeRepository {
    public static final String INSERT_INTO_EMPLOYEE = " insert into employee(name_employee,birthday_employee,id_card_employee,salary,phone,email,address,id_position,id_education_degree,id_division) values (?,?,?,?,?,?,?,?,?,?) ";
    private BaseRepository baseRepository = new BaseRepository();

    @Override
    public List<Employee> getAllEmployee() {
        List<Employee> employees = new ArrayList<>();
        Connection connection = this.baseRepository.getConnectionJavaTODB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from employee");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
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
        try(Connection connection = this.baseRepository.getConnectionJavaTODB()) {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_INTO_EMPLOYEE);
            preparedStatement.setString(1, employee.getName());
            preparedStatement.setString(2,employee.getBirthday());
            preparedStatement.setString(3,employee.getIdCard());
            preparedStatement.setDouble(4,employee.getSalary());
            preparedStatement.setString(5,employee.getPhone());
            preparedStatement.setString(6,employee.getEmail());
            preparedStatement.setString(7,employee.getAddress());
            preparedStatement.setInt(8,employee.getIdPosition());
            preparedStatement.setInt(9,employee.getIdEducationDegree());
            preparedStatement.setInt(10,employee.getIdDivision());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void remove(int id) {

    }
}
