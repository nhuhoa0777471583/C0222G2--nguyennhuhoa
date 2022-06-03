package repository.customer;

import model.Customer;
import repository.BaseRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerRepositoryImpl implements ICustomerRepository {
    public static final String SELECT_FROM_CUSTOMER = " select * from customer ";
    private BaseRepository baseRepository = new BaseRepository();

    @Override
    public List<Customer> getAll() {
        List<Customer> customerList = new ArrayList<>();
        try (  Connection connection = this.baseRepository.getConnectionJavaTODB();){
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_FROM_CUSTOMER);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Integer id = resultSet.getInt("id_customer");
                String name = resultSet.getString("name_customer");
                Date birthday = resultSet.getDate("birthday_customer");
                Integer gender = resultSet.getInt("gender_customer");
                String idCard = resultSet.getString("id_card_customer");
                String phone = resultSet.getString("phone");
                String email = resultSet.getString("email");
                String address = resultSet.getString("address");
                Integer idCustomerType = resultSet.getInt("id_customer_type");
                customerList.add(new Customer
                (id,name,birthday,gender,idCard,phone,email,address,idCustomerType));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customerList;
    }

    @Override
    public void save(Customer customer) {

    }

}
