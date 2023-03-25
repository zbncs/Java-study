package jdbc01;

import java.sql.*;

public class JDBCTest02 {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/mysqlFun";
        String user = "root";
        String password = "123456qq";
        Connection connection = DriverManager.getConnection(url, user, password);

        // 增
        //String sql = "insert into user values (6, '小七1', 23, 1),(7, '小玉', 23, 0)";
        Statement statement = connection.createStatement();

        //int i = statement.executeUpdate(sql);
        //System.out.println(i);

        // 删
        //String sql1 = "delete from user where id=5";
        //int i1 = statement.executeUpdate(sql1);
        //System.out.println(i1);

        // 改
        String sql2 = "update user set name='haha' where id=6";
        int i = statement.executeUpdate(sql2);
        System.out.println(i);

        // 查：见Test01

        statement.close();
        connection.close();
    }
}
