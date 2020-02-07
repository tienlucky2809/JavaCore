package Core3.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PrepareStatementJDBC {
    public static void main(String[] args) {
        Connection connection = JDBCConnection.getJDBCConnection();
        String sql = "select * from student where id = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, 12);
            ResultSet resultSet = preparedStatement.executeQuery();
           while (resultSet.next()){
               System.out.println(resultSet.getInt("id") + " " + resultSet.getString("name"));
           }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
