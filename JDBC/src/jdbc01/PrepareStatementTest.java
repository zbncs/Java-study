package jdbc01;

import java.sql.*;
import java.util.Scanner;
/**
 * PreparedStatement是Statement的子接口，可以防止sql注入问题。可以通过Connection接口中的prepareStatement(sql)方法获得PreparedStatement的对象。
 * sql提前创建好的。sql语句中需要参数。使用？进行占位
 *
 *
 *
 * */
public class PrepareStatementTest {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名:：");
        String name = scanner.nextLine();
        System.out.println("请输入密码：");
        String pwd = scanner.nextLine();

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysqlFun", "root", "123456qq");
        // 因为用户名和密码是varchar类型，需要加单引号
        //String sql = "select * from user2 where username='" + name +"' and password='" + pwd + "'";
        String sql = "select * from user2 where username=? and password=?";
        //Statement statement = connection.createStatement();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, name);
        preparedStatement.setString(2, pwd);
        ResultSet rs = preparedStatement.executeQuery();

        if (rs.next()) {
            String username = rs.getString("username");
            String password = rs.getString("password");
            System.out.println("登录成功" + username + password);
        } else {
            System.out.println("用户名或者密码错误");
        }

        rs.close();
        preparedStatement.close();
        connection.close();

    }
}
