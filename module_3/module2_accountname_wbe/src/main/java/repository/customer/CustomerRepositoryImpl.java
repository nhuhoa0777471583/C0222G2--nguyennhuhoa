package repository.customer;

import model.customer.Customer;
import repository.BaseRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerRepositoryImpl implements ICustomerRepository {
    public static final String SELECT_FROM_CUSTOMER = " select * from customer ";
    public static final String INSERT_INTO_CUSTOMER = " insert into customer(name_customer,birthday_customer,gender_customer,id_card_customer,phone,email,address,id_customer_type) value (?,?,?,?,?,?,?,?) ";
    public static final String DELETE_FROM_CUSTOMER = " delete from customer where id_customer = ? ";
    public static final String UPDATE_CUSTOMER = " update customer set name_customer = ?,birthday_customer=?,gender_customer = ?, id_card_customer = ?,phone = ?, email = ?,address =?,id_customer_type =? where id_customer= ? ";
    public static final String SELECT_CUSTOMER_BY_ID = " select name_customer,birthday_customer,gender_customer,id_card_customer,phone, " +
            " email,address,id_customer_type from customer where id_customer = ? ";
    public static final String FIND_BY_NAME_CUSTOMER = " select * from customer where name_customer like ? ";
    private BaseRepository baseRepository = new BaseRepository();

    @Override
    public List<Customer> getAll() {
        List<Customer> customerList = new ArrayList<>();
        try (Connection connection = this.baseRepository.getConnectionJavaTODB();) {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_FROM_CUSTOMER);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Integer id = resultSet.getInt("id_customer");
                String name = resultSet.getString("name_customer");
                String birthday = resultSet.getString("birthday_customer");
                Integer gender = resultSet.getInt("gender_customer");
                String idCard = resultSet.getString("id_card_customer");
                String phone = resultSet.getString("phone");
                String email = resultSet.getString("email");
                String address = resultSet.getString("address");
                Integer idCustomerType = resultSet.getInt("id_customer_type");
                customerList.add(new Customer
                        (id, name, birthday, gender, idCard, phone, email, address, idCustomerType));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customerList;
    }

    @Override
    public void save(Customer customer) {
        try (Connection connection = this.baseRepository.getConnectionJavaTODB();) {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_INTO_CUSTOMER);
            preparedStatement.setString(1, customer.getName());
            preparedStatement.setString(2, String.valueOf(customer.getBirthday()));
            preparedStatement.setInt(3, customer.getGender());
            preparedStatement.setString(4, customer.getIdCard());
            preparedStatement.setString(5, customer.getPhone());
            preparedStatement.setString(6, customer.getEmail());
            preparedStatement.setString(7, customer.getAddress());
            preparedStatement.setInt(8, customer.getIdCustomerType());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void delete(Integer id) {

        try (Connection connection = this.baseRepository.getConnectionJavaTODB()) {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_FROM_CUSTOMER);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void edit(Customer customer) {
        try (Connection connection = this.baseRepository.getConnectionJavaTODB()) {
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_CUSTOMER);
            preparedStatement.setString(1, customer.getName());
            preparedStatement.setString(2, String.valueOf(customer.getBirthday()));
            preparedStatement.setInt(3, customer.getGender());
            preparedStatement.setString(4, customer.getIdCard());
            preparedStatement.setString(5, customer.getPhone());
            preparedStatement.setString(6, customer.getEmail());
            preparedStatement.setString(7, customer.getAddress());
            preparedStatement.setInt(8, customer.getIdCustomerType());
            preparedStatement.setInt(9, customer.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Customer findById(Integer id) {
        Customer customers = null;

        try (Connection connection = this.baseRepository.getConnectionJavaTODB()) {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_CUSTOMER_BY_ID);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String name = resultSet.getString("name_customer");
                String birthday = resultSet.getString("birthday_customer");
                Integer gender = resultSet.getInt("gender_customer");
                String idCard = resultSet.getString("id_card_customer");
                String phone = resultSet.getString("phone");
                String email = resultSet.getString("email");
                String address = resultSet.getString("address");
                Integer idCustomerType = resultSet.getInt("id_customer_type");
                customers = new Customer(name, birthday, gender, idCard, phone, email, address, idCustomerType);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customers;
    }

    @Override
    public List<Customer> searchByName(String nameSearch) {
        List<Customer> customerList = new ArrayList<>();
        try (Connection connection = this.baseRepository.getConnectionJavaTODB()) {
            PreparedStatement preparedStatement = connection.prepareStatement(FIND_BY_NAME_CUSTOMER);
            preparedStatement.setString(1,  "%" + nameSearch +"%");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Integer id = Integer.parseInt(resultSet.getString("id_customer"));
                String name = resultSet.getString("name_customer");
                String birthday = resultSet.getString("birthday_customer");
                Integer gender = resultSet.getInt("gender_customer");
                String idCard = resultSet.getString("id_card_customer");
                String phone = resultSet.getString("phone");
                String email = resultSet.getString("email");
                String address = resultSet.getString("address");
                Integer idCustomerType = resultSet.getInt("id_customer_type");
                customerList.add(new Customer(id, name, birthday, gender, idCard, phone, email,
                        address, idCustomerType));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customerList;
    }

}
