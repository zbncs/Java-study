package jdbc01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCShiwu {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Shiwu", "root", "123456qq");
            // 开启事务
            connection.setAutoCommit(false);
            statement = connection.createStatement();
            String sql1 = "update account set money=money-100 where name='a'";
            String sql2 = "update account set money=money+100 where name='b'";
            int i = statement.executeUpdate(sql1);
            int i1 = statement.executeUpdate(sql2);

            connection.commit();
        } catch (SQLException e) {
            try {
                if (connection != null) {
                    connection.rollback();
                }
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }


    }
}
