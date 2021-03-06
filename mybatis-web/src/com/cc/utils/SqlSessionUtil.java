package com.cc.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;

/**
 * @Author: cs
 * @Date: 2021/3/1 12:21 上午
 * @Desc:
 */
public class SqlSessionUtil {
    private static SqlSessionFactory factory;
    private static ThreadLocal<SqlSession> local = new ThreadLocal<>();

    static {
        try {
            factory = new SqlSessionFactoryBuilder()
                    .build(Resources.getResourceAsStream("mybatis-config.xml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 工具类的构造方法一般都是私有的
     */
    private SqlSessionUtil() {
    }

    /**
     * 获取当前线程中的 SqlSession 对象
     */
    public static SqlSession getCurrentSqlSession() {
        SqlSession sqlSession = local.get();
        if (sqlSession == null) {
            sqlSession = factory.openSession();
            // 向t1线程上绑定SqlSession对象
            local.set(sqlSession);
        }

        return sqlSession;
    }

    /**
     * 释放资源
     */
    public void close(SqlSession sqlSession) {
        if (sqlSession != null) {
            sqlSession.close();
            // 非常重要
            // tomcat服务器自带线程池，用过的线程t1，下次可能还会使用线程t1
            local.remove();
        }
    }

    /**
     * 回滚事务
     */
    public void rollback(SqlSession sqlSession) {
        if (sqlSession != null) {
            sqlSession.rollback();
        }
    }
}
