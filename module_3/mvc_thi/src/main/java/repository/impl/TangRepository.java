package repository.impl;

import model.Tang;
import repository.BaseRepository;
import repository.ITangRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TangRepository implements ITangRepository {
    public static final String SELECT_FROM_TANG = " select * from tang ";
    private BaseRepository baseRepository = new BaseRepository();
    @Override
    public List<Tang> getAll() {
        List<Tang> tangList = new ArrayList<>();
        Connection connection = baseRepository.getConnectionJavaTODB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_FROM_TANG);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                Integer maTang = resultSet.getInt("ma_tang");
                Integer soTang = resultSet.getInt("so_tang");
                tangList.add(new Tang(maTang,soTang));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tangList;
    }
}
