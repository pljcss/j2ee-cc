package com.jdbctemplatedemo.service;

import com.jdbctemplatedemo.dao.BookDao;
import com.jdbctemplatedemo.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: cs
 * @Date: 2021/2/1 12:17 下午
 * @Desc:
 */
@Service
public class  BookService {
    /**
     * 注入dao
     */
    @Autowired
    private BookDao bookDao;

    /**
     * 新增
     * @param book
     */
    public void add(Book book) {
        bookDao.add(book);
    }


    /**
     * 修改
     */
    public void updateBookById(Book book, Integer bookId) {
        bookDao.updateBookById(book, bookId);
    }

    /**
     * 删除
     * @param
     */
    public void deleteBook(Integer id) {
        bookDao.deleteBook(id);
    }


    /**
     * 获取行数
     * @return
     */
    public Integer rowCount() {
        return bookDao.rowCount();
    }


    /**
     * 返回Book
     * @return
     */
    public Book getBookById(Integer bookId) {
        return bookDao.getBookById(bookId);
    }


    /**
     * 返回Book List
     * @return
     */
    public List<Book> getAllBook() {
        return bookDao.getAllBook();
    }

    /**
     * 批量添加
     */
    public void batchAdd(List<Object[]> batchArgs) {
        bookDao.batchAddBook(batchArgs);
    }

    /**
     * 批量修改
     */
    public void batchUpdate(List<Object[]> batchArgs) {
        bookDao.batchUpdate(batchArgs);
    }


}
