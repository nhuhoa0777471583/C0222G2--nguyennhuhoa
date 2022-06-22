package repository.impl;

import model.LoaiVanPhong;

import repository.BaseRepository;
import repository.ILoaiVanPhongRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LoaiVanPhongRepositoryImpl implements ILoaiVanPhongRepository {
    public static final String SELECT_FROM_LOAI_VAN_PHONG = " select * from loai_van_phong ";
    private BaseRepository baseRepository = new BaseRepository();
    @Override
    public List<LoaiVanPhong> getAll() {
        List<LoaiVanPhong> loaiVanPhongList = new ArrayList<>();
        try (Connection connection = baseRepository.getConnectionJavaTODB()) {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_FROM_LOAI_VAN_PHONG);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Integer maLoaiVanPhong = resultSet.getInt("ma_loai_van_phong");
                String tenLoaiVanPhong = resultSet.getString("ten_loai_van_phong");
                loaiVanPhongList.add(new LoaiVanPhong(maLoaiVanPhong, tenLoaiVanPhong));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return loaiVanPhongList;
    }
}
