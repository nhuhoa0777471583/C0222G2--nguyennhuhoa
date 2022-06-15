package repository.sevice.impl;

import com.mysql.cj.xdevapi.PreparableStatement;
import model.service.RentType;
import repository.BaseRepository;
import repository.sevice.IRentTypeRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

public class RentTypeRepository implements IRentTypeRepository {
    public static final String SELECT_FROM_RENT_TYPE = " select * from rent_type ";
    private BaseRepository baseRepository = new BaseRepository();
    @Override
    public List<RentType> getAllRentType() {
        List<RentType> rentTypeList = new ArrayList<>();
        Connection connection = baseRepository.getConnectionJavaTODB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_FROM_RENT_TYPE);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                Integer id = resultSet.getInt("id_rent_type");
                String name = resultSet.getString("name_rent_type");
                Double costRentType = resultSet.getDouble("cost_rent_type");
                rentTypeList.add(new RentType(id, name, costRentType));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rentTypeList;
    }
}
