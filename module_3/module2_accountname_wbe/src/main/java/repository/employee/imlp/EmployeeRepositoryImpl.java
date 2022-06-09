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
    public static final String DELETE_EMPLOYEE_BY_ID = " delete from employee where id_employee = ? ";
    public static final String SELECT_FROM_EMPLOYEE = "select * from employee";
    public static final String SELECT_EMPLOYEE_BY_ID = " select name_employee,birthday_employee, " +
            " id_card_employee,salary,phone,email,address,id_position,id_education_degree,id_division " +
            "from employee where id_employee = ? ";
    public static final String UPDATE_EMPLOYEE_BY_ID = " update employee set name_employee = ?,birthday_employee = ?, " +
            " id_card_employee = ?,salary = ?,phone = ?,email = ?,address = ?, " +
            " id_position = ?,id_education_degree = ?,id_division = ? " +
            " where id_employee = ? ";
    public static final String FIND_BY_NAME_EMPLOYEE = " select  * from employee " +
            " inner join position_employee on employee.id_position = position_employee.id_position " +
            " inner join education_degree on employee.id_education_degree = education_degree.id_education_degree " +
                " inner join divition on employee.id_division = divition.id_division  where employee.name_employee like ? ";
    private BaseRepository baseRepository = new BaseRepository();

    @Override
    public List<Employee> getAllEmployee() {
        List<Employee> employees = new ArrayList<>();
        Connection connection = this.baseRepository.getConnectionJavaTODB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_FROM_EMPLOYEE);
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
                employees.add(new Employee
                        (id, name, birthday, idCard, salary, phone, email, address, idPosition, idEducationDegree, idDivision));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employees;
    }

    @Override
    public void save(Employee employee) {
        try (Connection connection = this.baseRepository.getConnectionJavaTODB()) {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_INTO_EMPLOYEE);
            preparedStatement.setString(1, employee.getName());
            preparedStatement.setString(2, employee.getBirthday());
            preparedStatement.setString(3, employee.getIdCard());
            preparedStatement.setDouble(4, employee.getSalary());
            preparedStatement.setString(5, employee.getPhone());
            preparedStatement.setString(6, employee.getEmail());
            preparedStatement.setString(7, employee.getAddress());
            preparedStatement.setInt(8, employee.getIdPosition());
            preparedStatement.setInt(9, employee.getIdEducationDegree());
            preparedStatement.setInt(10, employee.getIdDivision());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void deleteEmployee(Integer id) {
        Connection connection = baseRepository.getConnectionJavaTODB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_EMPLOYEE_BY_ID);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Employee findById(Integer id) {
        Employee employee = null;
        try (Connection connection = baseRepository.getConnectionJavaTODB()) {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_EMPLOYEE_BY_ID);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
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
                employee = new Employee(name, birthday, idCard, salary, phone, email, address, idPosition, idEducationDegree, idDivision);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employee;
    }

    @Override
    public void update(Employee employeeUpdate) {
        try (Connection connection = this.baseRepository.getConnectionJavaTODB()) {
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_EMPLOYEE_BY_ID);
            preparedStatement.setString(1, employeeUpdate.getName());
            preparedStatement.setString(2, employeeUpdate.getBirthday());
            preparedStatement.setString(3, employeeUpdate.getIdCard());
            preparedStatement.setDouble(4, employeeUpdate.getSalary());
            preparedStatement.setString(5, employeeUpdate.getPhone());
            preparedStatement.setString(6, employeeUpdate.getEmail());
            preparedStatement.setString(7, employeeUpdate.getAddress());
            preparedStatement.setInt(8, employeeUpdate.getIdPosition());
            preparedStatement.setInt(9, employeeUpdate.getIdEducationDegree());
            preparedStatement.setInt(10, employeeUpdate.getIdDivision());
            preparedStatement.setInt(11, employeeUpdate.getId());
//            update chưa đc
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Employee> searchNameEmployee(String nameSearch) {
        List<Employee> employeeList = new ArrayList<>();
        try(Connection connection = baseRepository.getConnectionJavaTODB()) {
            PreparedStatement preparedStatement = connection.prepareStatement(FIND_BY_NAME_EMPLOYEE);
            preparedStatement.setString(1,"%"+nameSearch+"%");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                Integer id =resultSet.getInt("id_employee");
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
                employeeList.add(new Employee(id,name, birthday, idCard, salary, phone, email,
                        address, idPosition, idEducationDegree, idDivision));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employeeList;
    }
}
