package org.example.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SessionUtil {
   static  SqlSessionFactory factory;
    static {
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        InputStream is = null;
        try {
            is = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        factory = builder.build(is);
    }
    // 自动提交事务
    public static SqlSession getSqlSession() {
        SqlSession session = factory.openSession(true);
        return session;
    }
    // 手动控制是否提交事务
    public static SqlSession getSqlSession(boolean isAutoCommit) {
        SqlSession session = factory.openSession(isAutoCommit);
        return session;
    }
    // 提交事务并关闭
    public static void close(SqlSession session) {
        if (session != null) {
            session.commit();
            session.close();
        }
    }

    // 回滚事务并关闭
    public static void rollback(SqlSession session) {
        if (session != null) {
            session.rollback();
            session.close();
        }
    }

}
