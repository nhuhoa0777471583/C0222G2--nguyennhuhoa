package repository.impl;

import model.TrangThai;
import repository.BaseRepository;
import repository.ITrangThaiRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TrangThaiRepositoryImpl implements ITrangThaiRepository {
    public static final String SELECT_FROM_TRANG_THAI = " select * from trang_thai ";
    private BaseRepository baseRepository = new BaseRepository();

    @Override
    public List<TrangThai> getAll() {
        List<TrangThai> trangThaiList = new ArrayList<>();
        try (Connection connection = baseRepository.getConnectionJavaTODB()) {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_FROM_TRANG_THAI);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Integer maTrangThai = resultSet.getInt("ma_trang_thai");
                String tenTrangThai = resultSet.getString("ten_trang_thai");
                trangThaiList.add(new TrangThai(maTrangThai, tenTrangThai));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return trangThaiList;
    }
}
