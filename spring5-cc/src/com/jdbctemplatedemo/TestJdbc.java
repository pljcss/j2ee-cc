package com.jdbctemplatedemo;

import com.jdbctemplatedemo.entity.Book;
import com.jdbctemplatedemo.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: cs
 * @Date: 2021/2/1 12:57 下午
 * @Desc:
 */
public class TestJdbc {

    @Test
    public void testAdd() {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/jdbctemplatedemo/bean.xml");

        BookService bookService = context.getBean("bookService", BookService.class);

        Book book = new Book("null", "从一到无穷大", "科普");
        bookService.add(book);
    }


    @Test
    public void testUpdateById() {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/jdbctemplatedemo/bean.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

        Book book = new Book();
        book.setBookName("新修改");
        book.setBookType("新修改");
        bookService.updateBookById(book,1);
    }


    @Test
    public void testDeleteById() {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/jdbctemplatedemo/bean.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

        bookService.deleteBook(3);
    }

    @Test
    public void testRowCount() {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/jdbctemplatedemo/bean.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

        System.out.println(bookService.rowCount());
    }


    @Test
    public void getBookById() {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/jdbctemplatedemo/bean.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

        System.out.println(bookService.getBookById(4));
    }


    @Test
    public void getAllBook() {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/jdbctemplatedemo/bean.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

        System.out.println(bookService.getAllBook());
    }


    @Test
    public void batchAdd() {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/jdbctemplatedemo/bean.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

        List<Object[]> batchArgs = new ArrayList<>();
        Object[] o1 = {"Java编程思想", "计算机"};
        Object[] o2 = {"C++编程思想", "计算机"};
        Object[] o3 = {"Python编程思想", "计算机"};
        batchArgs.add(o1);
        batchArgs.add(o2);
        batchArgs.add(o3);

        bookService.batchAdd(batchArgs);
    }



}
