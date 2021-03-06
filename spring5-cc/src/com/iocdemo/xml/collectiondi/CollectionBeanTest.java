package com.iocdemo.xml.collectiondi;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

/**
 * @Author: cs
 * @Date: 2021/1/27 6:04 下午
 * @Desc:
 */
public class CollectionBeanTest {

    @Test
    public void collectionBeanTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/iocdemo/xml/collectiondi/bean5.xml");
        Student student = context.getBean("student", Student.class);

        System.out.println(Arrays.toString(student.getCourses()));
        System.out.println(student.getList());
        System.out.println(student.getMap());
        System.out.println(student.getSet());
        System.out.println(student.getCourseList());
    }

    @Test
    public void collectionBeanTest2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/iocdemo/xml/collectiondi/bean6.xml");
        Movie movie = context.getBean("movie", Movie.class);

        System.out.println(movie.getMovieNameList());
    }
}
