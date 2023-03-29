package org.example.mybatis_01;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.dao.UserMapper;
import org.example.pojo.User;
import org.example.util.SessionUtil;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
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
    public void queryUserById() throws IOException {
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory = builder.build(is);
        SqlSession sqlSession = factory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.queryUserById(1);
        System.out.println(user);
    }

    @Test
    public void addUser() throws IOException {
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory = builder.build(is);
        SqlSession sqlSession = factory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user1 = new User();
        user1.setUserName("蒋玉");
        user1.setBirthday(new Date(1999, 10, 1));
        user1.setSex("女");
        user1.setAddress("我家");
        mapper.addUser(user1);
        // mybatis 控制事务默认是手动提交事务，所以针对增删改需要提交事务，也可以设置自动提交事务
        // 1.手动提交：sqlSession.commit()
        // 2.自动提交事务 SqlSession sqlSession = factory.openSession(true);
        sqlSession.commit();
    }

    @Test
    public void updateUser() throws IOException {
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory = builder.build(is);
        SqlSession sqlSession = factory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user1 = new User();
        user1.setId(3);
        user1.setUserName("蒋玉1");
        user1.setSex("女");

        mapper.updateUser(user1);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void deleteUser() throws IOException {
//        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
//        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
//        SqlSessionFactory factory = builder.build(is);
//        SqlSession sqlSession = factory.openSession(true);
        SqlSession sqlSession = SessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.deleteUser(4);
    }


//    动态SQL查询
    @Test
    public void queryUsersBySexOrUserName() {
        SqlSession sqlSession = SessionUtil.getSqlSession(false);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.queryUsersBySexOrUserName("孙");
        System.out.println(users);
    }

    @Test
    public void queryUsersBySexOrUserNameOrAddr() {
        SqlSession sqlSession = SessionUtil.getSqlSession(false);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.queryUsersBySexOrUserNameOrAddr("", "花果山水帘洞");
        System.out.println(users);
    }

    @Test
    public void queryUsersByUserNameAndAddress() {
        SqlSession sqlSession = SessionUtil.getSqlSession(false);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.queryUsersByUserNameAndAddress("", "花果山水帘洞");
        System.out.println(users);
    }

    @Test
    public void updateUserById() {
        SqlSession sqlSession = SessionUtil.getSqlSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user1 = new User();
        user1.setId(3);
        user1.setUserName("蒋玉");
        user1.setSex("女");
        user1.setAddress("我家");
        user1.setBirthday(new Date());

        mapper.updateUserById(user1);
    }

    @Test
    public void findByIds() {
        SqlSession sqlSession = SessionUtil.getSqlSession(false);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3);
        List<User> users = mapper.findByIds(list);
        System.out.println(users);
    }


    }
