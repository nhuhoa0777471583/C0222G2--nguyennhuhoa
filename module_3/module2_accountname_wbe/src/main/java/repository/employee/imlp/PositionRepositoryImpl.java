package repository.employee.imlp;

import model.employee.Position;
import repository.BaseRepository;
import repository.employee.IPositionRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PositionRepositoryImpl implements IPositionRepository {
    public static final String SELECT_POSITION = " select id_position, name_position from position_employee ";
    private BaseRepository baseRepository = new BaseRepository();
    @Override
    public List<Position> getAllPosition() {
        List<Position> positions = new ArrayList<>();

        try( Connection connection = this.baseRepository.getConnectionJavaTODB()) {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_POSITION);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                Integer id = resultSet.getInt("id_position");
                String name = resultSet.getString("name_position");
                positions.add(new Position(id,name));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return positions;
    }
}
