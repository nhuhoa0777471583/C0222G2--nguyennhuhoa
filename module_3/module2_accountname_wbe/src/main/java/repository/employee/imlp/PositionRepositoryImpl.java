package repository.employee.imlp;

import model.employee.Position;
import repository.BaseRepository;
import repository.employee.IPosition;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PositionRepositoryImpl implements IPosition {
    private BaseRepository baseRepository = new BaseRepository();
    @Override
    public List<Position> getAllPosition() {
        List<Position> positions = new ArrayList<>();

        try( Connection connection = this.baseRepository.getConnectionJavaTODB()) {
            PreparedStatement preparedStatement = connection.prepareStatement(" select * from position_employee ");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                Integer id = resultSet.getInt("idPosition");
                String name = resultSet.getString("namePosition");
                positions.add(new Position(id,name));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return positions;
    }
}
