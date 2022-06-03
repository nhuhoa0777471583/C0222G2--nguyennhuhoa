package repository.customer;


import model.CustomerType;
import repository.BaseRepository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CustomerTypeRepositoryImpl implements ICustomerTypeRepository {
    private BaseRepository baseRepository = new BaseRepository();
    @Override
    public List<CustomerType> getAllCutomerType() {
        List<CustomerType> customerTypeList = new ArrayList<>();
        Connection connection = this.baseRepository.getConnectionJavaTODB();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(" select * from customer_type ");
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

    @Override
    public void save(CustomerType customerType) {

    }
}
