package repository.employee.imlp;

import model.employee.Divition;
import repository.BaseRepository;
import repository.employee.IDivitionRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DivitionRepositoryImpl implements IDivitionRepository {
    public static final String SELECT_DIVITION = " select id_division, name_divition from divition ";
    private BaseRepository baseRepository = new BaseRepository();

    @Override
    public List<Divition> getAllDivition() {
        List<Divition> divitionList = new ArrayList<>();
        try(Connection connection = this.baseRepository.getConnectionJavaTODB()) {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_DIVITION);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                Integer id = resultSet.getInt("id_division");
                String name = resultSet.getString("name_divition");
                divitionList.add(new Divition(id ,name));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return divitionList;
    }
}
