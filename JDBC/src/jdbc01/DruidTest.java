package jdbc01;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public class DruidTest {
    public static void main(String[] args) throws Exception {
        Properties p = new Properties();
        p.load(new FileInputStream("JDBC/src/druid.properties"));
        DataSource ds = DruidDataSourceFactory.createDataSource(p);

        Connection connection = ds.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("select * from user2");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            String name = resultSet.getString("username");
            String password = resultSet.getString("password");

            System.out.println(name + password);
        }

        resultSet.close();
        preparedStatement.close();
        connection.close(); // 不是将连接还给数据库，而是放到连接池中
    }
}
