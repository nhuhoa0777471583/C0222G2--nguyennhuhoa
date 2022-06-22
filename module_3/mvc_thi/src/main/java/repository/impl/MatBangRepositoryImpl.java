package repository.impl;

import model.MatBang;
import repository.BaseRepository;
import repository.IMatBangRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MatBangRepositoryImpl implements IMatBangRepository {
    public static final String SELECT_FROM_MAT_BANG = " select * from mat_bang ";
    public static final String INSERT_INTO_MAT_BANG = "insert into mat_bang value (?,?,?,?,?,?,?,?,?) ";
    public static final String DELETE_FROM_MAT_BANG = " delete from mat_bang where ma_mat_bang = ? ";
    private BaseRepository baseRepository = new BaseRepository();

    @Override
    public List<MatBang> getAll() {
        List<MatBang> matBangList = new ArrayList<>();
        try (Connection connection = baseRepository.getConnectionJavaTODB()) {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_FROM_MAT_BANG);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String maMatBang = resultSet.getString("ma_mat_bang");
                Double dienTich = resultSet.getDouble("dien_tich");
                Integer maTrangThai = resultSet.getInt("ma_trang_thai");
                Integer tang = resultSet.getInt("ma_tang");
                Integer maLoaiVanPhong = resultSet.getInt("ma_loai_van_phong");
                String moTa = resultSet.getString("mo_ta_chi_tiet");
                Double gia = resultSet.getDouble("gia_cho_thue");
                String ngayBatDau = resultSet.getString("ngay_bat_dau");
                String ngayKetThuc = resultSet.getString("ngay_ket_thuc");
                matBangList.add(new MatBang(maMatBang, dienTich, maTrangThai, tang,
                        maLoaiVanPhong, moTa, gia, ngayBatDau, ngayKetThuc));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return matBangList;
    }

    @Override
    public void delete(String id) {
        try (Connection connection = baseRepository.getConnectionJavaTODB()) {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_FROM_MAT_BANG);
            preparedStatement.setString(1,id);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public MatBang findById(Integer id) {
        return null;
    }

    @Override
    public void save(MatBang matBang) {

        try (Connection connection = baseRepository.getConnectionJavaTODB()) {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_INTO_MAT_BANG);
            preparedStatement.setString(1, matBang.getMaMatBang());
            preparedStatement.setDouble(2, matBang.getDienTich());
            preparedStatement.setInt(3, matBang.getMaTrangThai());
            preparedStatement.setInt(4, matBang.getMaTang());
            preparedStatement.setInt(5, matBang.getMaLoaiVanPhong());
            preparedStatement.setString(6, matBang.getMoTaChiTiet());
            preparedStatement.setDouble(7, matBang.getGia());
            preparedStatement.setString(8, matBang.getNgayBatDau());
            preparedStatement.setString(9, matBang.getNgayKetThuc());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
