package repository.sevice.impl;

import com.mysql.cj.xdevapi.PreparableStatement;
import model.service.ServiceType;
import repository.BaseRepository;
import repository.sevice.IServiceTypeRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ServceTypeRepository implements IServiceTypeRepository {
    private BaseRepository baseRepository = new BaseRepository();
    public static final String SELECT_FROM_RENT_TYPE = " select * from service_type ";

    @Override
    public List<ServiceType> getAllServiceType() {
        List<ServiceType> serviceTypeList = new ArrayList<>();
        Connection connection = baseRepository.getConnectionJavaTODB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_FROM_RENT_TYPE);
            ResultSet resultSet= preparedStatement.executeQuery();
            while (resultSet.next()){
                Integer id = resultSet.getInt("id_service_type");
                String name = resultSet.getString("name_service_type");
                serviceTypeList.add(new ServiceType(id, name));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return serviceTypeList;
    }
}
