package com.jdbctemplatedemo.dao;

import com.jdbctemplatedemo.entity.Book;

import java.util.List;

/**
 * @Author: cs
 * @Date: 2021/2/1 12:16 下午
 * @Desc:
 */
public interface BookDao {
    void add(Book book);

    void updateBookById(Book book, Integer bookId);

    void deleteBook(Integer id);

    Integer rowCount();

    Book getBookById(Integer id);

    List<Book> getAllBook();

    void batchAddBook(List<Object[]> batchArgs);

    void batchUpdate(List<Object[]> batchArgs);
}
