package repository.sevice.impl;

import com.mysql.cj.xdevapi.PreparableStatement;
import model.service.Service;
import repository.BaseRepository;
import repository.sevice.IServiceRepository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ServiceRepositoryImpl implements IServiceRepository {
    public static final String SELECT_FROM_SERVICE = " select * from service ";
    private BaseRepository baseRepository = new BaseRepository();


    @Override
    public List<Service> getAllService() {
        List<Service> serviceList = new ArrayList<>();
        Connection connection = baseRepository.getConnectionJavaTODB();
        PreparableStatement preparedStatement = connection.prepareStatement(SELECT_FROM_SERVICE);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            Integer id = resultSet.getInt("id_service");
            String name = resultSet.getString("name_service");
            Integer area = resultSet.getInt("area");
            Double cost = resultSet.getDouble("cost");
            Integer maxPeople = resultSet.getInt("max_people");
            String standardRoom = resultSet.getString("standard_room");
            String descriptionOtherConvenience = resultSet.getString("description_other_convenience");
            Double poolArea = resultSet.getDouble("pool_area");
            Integer numberOfFloat = resultSet.getInt("number_of_float");
            Integer idRentType = resultSet.getInt("id_rent_type");
            Integer idServiceType = resultSet.getInt("id_service_type");
            serviceList.add(new Service(id, name, area, cost, maxPeople, standardRoom, descriptionOtherConvenience,
                    poolArea, numberOfFloat, idRentType, idServiceType));
        }
        return serviceList;
    }
}
