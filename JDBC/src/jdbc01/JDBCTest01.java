package jdbc01;

import java.sql.*;
/**
 * 注册驱动: 从MySQL5以后不需要书写了，底层自动注册java.sql.DriverManager.registerDriver(new Driver());
 *      底层使用spi机制，自动查找驱动包下面的：META-INF/services/java.sql.Drive的文件内容：com.mysql.cj.jdbc.Driver
 *
 *Connection connection = DriverManager.getConnection(url, user, password);
 *      1.获取执行SQL语句对象；
 *     2. connection 也可以操作事务：
 *          手动开启事务：setAutoCommit(false)
 *          提交事务：commit();
 *          异常回归：rollback();
 *createStatement() :
 *      executeUpdate(): 执行SQL语句，该语句可以是insert update delete 语句；返回行记录数(影响的行数)；
 *          对于什么都不返回的SQL语句，返回0
 *
 *      executeQuery(): 执行select语句，返回ResultSet，从数据库查找的结果；
 *
 *
 *
 *
 * */
public class JDBCTest01 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 1.注册驱动
        // Class.forName("com.mysql.jdbc.Driver"); // 已经废弃了
        //Class.forName("com.mysql.cj.jdbc.Driver");
        // 2.获取和数据库连接池
        String url = "jdbc:mysql://localhost:3306/mysqlFun";
        String user = "root";
        String password = "123456qq";
        Connection connection = DriverManager.getConnection(url, user, password);
        // 3.定义SQL语句
        String sql = "select * from user";

        // 4.获取执行SQL对象
        Statement statement = connection.createStatement();
        // 5.执行SQL
        ResultSet resultSet = statement.executeQuery(sql);
        // 6.处理结果
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            int age = resultSet.getInt("age");
            int sex = resultSet.getInt("sex");
            System.out.println(id + "----" + name + "----" + age + "----" + sex);
        }

        // 7.释放资源
        resultSet.close();
        statement.close();
        connection.close();
    }
}
