package repository.employee.imlp;

import model.employee.Divition;
import repository.BaseRepository;
import repository.employee.IDivition;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DivitionRepository implements IDivition {
    private BaseRepository baseRepository = new BaseRepository();

    @Override
    public List<Divition> getAllDivition() {
        List<Divition> divitionList = new ArrayList<>();
        try(Connection connection = this.baseRepository.getConnectionJavaTODB()) {
            PreparedStatement preparedStatement = connection.prepareStatement(" select * from divition ");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                Integer id = resultSet.getInt("idDivition");
                String name = resultSet.getString("nameDivition");
                divitionList.add(new Divition(id ,name));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return divitionList;
    }
}
