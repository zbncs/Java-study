package jdbc01;

import java.sql.*;
import java.util.Scanner;

public class JDBCLogin {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名");
        String name = scanner.nextLine();
        System.out.println("请输入密码");
        String pwd = scanner.nextLine();

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysqlFun", "root", "123456qq");
        // 因为用户名和密码是varchar类型，需要加单引号
        String sql = "select * from user2 where username='" + name +"' and password='" + pwd + "'";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        if (resultSet.next()) {
            String username = resultSet.getString("username");
            String password = resultSet.getString("password");
            System.out.println("登录成功" + username + password);
        } else {
            System.out.println("用户名或者密码错误");
        }

        resultSet.close();
        statement.close();
        connection.close();

    }
}
