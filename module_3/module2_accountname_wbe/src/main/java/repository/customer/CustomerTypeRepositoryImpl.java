package repository.customer;


import model.customer.CustomerType;
import repository.BaseRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerTypeRepositoryImpl implements ICustomerTypeRepository {
    public static final String SELECT_FROM_CUSTOMER_TYPE = " select id_customer_type,name_customer_type from customer_type ";
    private BaseRepository baseRepository = new BaseRepository();
    @Override
    public List<CustomerType> getAllCustomerType() {
        List<CustomerType> customerTypeList = new ArrayList<>();
        Connection connection = this.baseRepository.getConnectionJavaTODB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_FROM_CUSTOMER_TYPE);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Integer id = resultSet.getInt("id_customer_type");
                String name = resultSet.getString("name_customer_type");
                customerTypeList.add(new CustomerType(id ,name));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customerTypeList;
    }

}
