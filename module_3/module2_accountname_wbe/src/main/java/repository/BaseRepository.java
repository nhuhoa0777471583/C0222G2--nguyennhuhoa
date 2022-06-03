package repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseRepository {
    private String jdbcURL = "jdbc:mysql://localhost:3306/case_study_module_3?useSSL=false";
    private String username = "root";
    private String password = "nhuhoa2303";
    private Connection connection;

    public BaseRepository() {
    }

    public Connection getConnectionJavaTODB() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(jdbcURL, username, password);
            return connection;

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
