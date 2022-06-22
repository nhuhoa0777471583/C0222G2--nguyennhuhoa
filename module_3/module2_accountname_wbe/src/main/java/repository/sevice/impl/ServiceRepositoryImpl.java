package repository.sevice.impl;

import model.service.Service;
import repository.BaseRepository;
import repository.sevice.IServiceRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ServiceRepositoryImpl implements IServiceRepository {
    public static final String SELECT_FROM_SERVICE = " select * from service ";
    public static final String INSERT_INTO_SERVICE = " insert into service (name_service,area,cost,max_people,standard_room,description_other_convenience,pool_area,number_of_float,id_rent_type,id_service_type) value (?,?,?,?,?,?,?,?,?,?) ";
    public static final String DELETE_FROM_SERVICE_WHERE_ID_SERVICE = " delete from service where id_service = ? ";
    public static final String SELECT_SERVICE_BY_ID = " select name_service,area,cost,max_people,standard_room," +
            " description_other_convenience,pool_area,number_of_float," +
            " id_rent_type,id_service_type from service where id_service = ? ";
    public static final String UPDATE_SERVICE = " update service set name_service = ?,area = ?,cost = ?,max_people = ?," +
            " standard_room = ?," +
            " description_other_convenience = ?,pool_area = ?,number_of_float = ?," +
            " id_rent_type = ? ,id_service_type = ? where id_service = ?  ";
    public static final String FIND_BY_NAME = " select * from service where name_service like ? ";
    private BaseRepository baseRepository = new BaseRepository();


    @Override
    public List<Service> getAllService() {
        List<Service> serviceList = new ArrayList<>();

        try (Connection connection = baseRepository.getConnectionJavaTODB();) {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_FROM_SERVICE);
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
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return serviceList;
    }


    @Override
    public void save(Service service) {
        try (Connection connection = baseRepository.getConnectionJavaTODB()) {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_INTO_SERVICE);
            preparedStatement.setString(1, service.getNameService());
            preparedStatement.setInt(2, service.getArea());
            preparedStatement.setDouble(3, service.getCost());
            preparedStatement.setInt(4, service.getMaxPeople());
            preparedStatement.setString(5, service.getStandardRoom());
            preparedStatement.setString(6, service.getDescriptionOtherConvenience());
            preparedStatement.setDouble(7, service.getPoolArea());
            preparedStatement.setInt(8, service.getNumberOfFloat());
            preparedStatement.setInt(9, service.getIdRentType());
            preparedStatement.setInt(10, service.getIdServiceType());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void delete(Integer id) {
        Connection connection = baseRepository.getConnectionJavaTODB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_FROM_SERVICE_WHERE_ID_SERVICE);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Service findById(Integer id) {
        Service service = null;
        try (Connection connection = baseRepository.getConnectionJavaTODB()) {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_SERVICE_BY_ID);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
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
                service = new Service(name, area, cost, maxPeople, standardRoom, descriptionOtherConvenience,
                        poolArea, numberOfFloat, idRentType, idServiceType);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return service;
    }

    @Override
    public void update(Service service) {
        try (Connection connection = baseRepository.getConnectionJavaTODB()) {
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_SERVICE);
            preparedStatement.setString(1, service.getNameService());
            preparedStatement.setInt(2, service.getArea());
            preparedStatement.setDouble(3, service.getCost());
            preparedStatement.setInt(4, service.getMaxPeople());
            preparedStatement.setString(5, service.getStandardRoom());
            preparedStatement.setString(6, service.getDescriptionOtherConvenience());
            preparedStatement.setDouble(7, service.getPoolArea());
            preparedStatement.setInt(8, service.getNumberOfFloat());
            preparedStatement.setInt(9, service.getIdRentType());
            preparedStatement.setInt(10, service.getIdServiceType());
            preparedStatement.setInt(11, service.getIdService());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public  List<Service> searchName(String nameSearchService) {
        List<Service> service = new ArrayList<>();
        try(Connection connection = baseRepository.getConnectionJavaTODB()) {
            PreparedStatement preparedStatement = connection.prepareStatement(FIND_BY_NAME);
            preparedStatement.setString(1,"%" + nameSearchService + "%");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
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
                service.add(new Service(id,name, area, cost, maxPeople, standardRoom, descriptionOtherConvenience,
                        poolArea, numberOfFloat, idRentType, idServiceType));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return service;
    }
}
