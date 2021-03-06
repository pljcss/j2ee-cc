package com.mybatis.demo;

import com.mybatis.domain.Student;
import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: cs
 * @Date: 2021/2/26 12:09 下午
 * @Desc:
 */
public class MyBatisTest {
    public static void main(String[] args) {
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        SqlSession sqlSession1 = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

            // 事务自动提交机制关闭，等同于conn.setAutoCommit(false)
            // SqlSession等同看作Connection，专门用来执行SQL语句的
            // 开启事务
            sqlSession1 = sqlSessionFactory.openSession();

            // 业务逻辑
            // 1、insert
//            Student student1 = new Student();
//            student1.setId("4");
//            student1.setName("ddd");
//            student1.setSubjectId("44");
//            sqlSession1.insert("insertStudent", student1);

            // insert 通过map
//            Map<String ,String> map = new HashMap<>(5);
//            map.put("idMap", "5");
//            map.put("nameMap", "eee");
//            map.put("subjectIdMap", "66");
//            sqlSession1.insert("insertStudentByMap", map);

            // update
//            Student student2 = new Student("1","aaa111", "1199");
//            sqlSession1.update("updateStudent", student2);

            // delete
//            sqlSession1.delete("deleteById", "4");

            // selectOne
            Student selectById = sqlSession1.selectOne("selectById", "1");
            System.out.println(selectById);

            // selectList
            List<Student> allStudent = sqlSession1.selectList("getAllStudent");

            for (Student student : allStudent) {
                System.out.println(student);
            }

            // select 使用map封装查询结果
            List<Map<String, String>> allStudent2 = sqlSession1.selectList("selectAll");
            for (Map<String, String> stringStringMap : allStudent2) {
                System.out.println("==" + stringStringMap);
            }

            // 没有出现异常，则事务提交
            sqlSession1.commit();

        } catch (IOException e) {
            // 出现异常，则回滚
            if (sqlSession1 != null) {
                sqlSession1.rollback();
            }
            e.printStackTrace();

        } finally {
            // 关闭
            if (sqlSession1 != null) {
                sqlSession1.close();
            }
        }

    }
}
