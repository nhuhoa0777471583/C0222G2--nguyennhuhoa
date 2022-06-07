package repository.employee.imlp;

import model.employee.Education;
import repository.BaseRepository;
import repository.employee.IEducation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EducationRepositoryImpl implements IEducation {
    private BaseRepository baseRepository = new BaseRepository();
    @Override
    public List<Education> getAllEducation() {
        List<Education> educationList = new ArrayList<>();
        try(Connection connection = this.baseRepository.getConnectionJavaTODB();) {
            PreparedStatement preparedStatement = connection.prepareStatement(" select * from education_degree ");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                Integer id = resultSet.getInt("idEducation");
                String name = resultSet.getString("nameEducation");
                educationList.add(new Education(id,name));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return educationList;
    }
}
