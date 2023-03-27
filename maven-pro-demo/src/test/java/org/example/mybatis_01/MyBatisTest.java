package org.example.mybatis_01;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.dao.UserMapper;
import org.example.pojo.User;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * 如果使用Maven提供的命令test运行测试，要求测试类的类名必须以Test结尾
 *
 * */
public class MyBatisTest {
    @Test
    public void queryAllUsers() throws IOException {
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory = builder.build(is);
        SqlSession sqlSession = factory.openSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> list = mapper.queryAllUsers();

        for (User user : list) {
            System.out.println(user);
        }

    }
    @Test
    public void show1() {
        System.out.println("show1");
    }
}
