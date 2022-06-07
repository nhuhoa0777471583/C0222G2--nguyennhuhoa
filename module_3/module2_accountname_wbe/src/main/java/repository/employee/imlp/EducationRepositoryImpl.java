package repository.employee.imlp;

import model.employee.Education;
import repository.BaseRepository;
import repository.employee.IEducationRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EducationRepositoryImpl implements IEducationRepository {
    public static final String SELECT_EDUCATION = " select id_education_degree,name_education_degree  from education_degree ";
    private BaseRepository baseRepository = new BaseRepository();
    @Override
    public List<Education> getAllEducation() {
        List<Education> educationList = new ArrayList<>();
        try(Connection connection = this.baseRepository.getConnectionJavaTODB();) {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_EDUCATION);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                Integer id = resultSet.getInt("id_education_degree");
                String name = resultSet.getString("name_education_degree");
                educationList.add(new Education(id,name));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return educationList;
    }
}
