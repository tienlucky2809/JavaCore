package Core3.JDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementJDBC {

    public static void insertStatement(int id, String name) {

        try {
            Connection connection = JDBCConnection.getJDBCConnection();
            Statement statement = connection.createStatement();

            String sql = "insert into student(id, name) values (" + id + ", ' " + name + " ')";

            int rs = statement.executeUpdate(sql);
            System.out.println(rs);
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateStatement(int id, String newName) {

        try {
            Connection connection = JDBCConnection.getJDBCConnection();
            Statement statement = connection.createStatement();

            String sql = "update student set name = '" + newName + "' where id = " + id;

            int rs = statement.executeUpdate(sql);
            System.out.println(rs);
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void deleteStatement(int id) {

        try {
            Connection connection = JDBCConnection.getJDBCConnection();
            Statement statement = connection.createStatement();

            String sql = "delete from student where id = " + id;

            int rs = statement.executeUpdate(sql);
            System.out.println(rs);
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



    public static void main(String[] args) {
        //insertStatement(12, "AB");
        //updateStatement(11, "aa");
        deleteStatement(2);
    }

}
