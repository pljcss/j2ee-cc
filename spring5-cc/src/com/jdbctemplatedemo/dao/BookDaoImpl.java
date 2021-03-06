package com.jdbctemplatedemo.dao;

import com.jdbctemplatedemo.entity.Book;
import com.sun.xml.internal.bind.v2.TODO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: cs
 * @Date: 2021/2/1 12:17 下午
 * @Desc:
 */
@Repository
public class BookDaoImpl implements BookDao{
    /**
     * 注入JdbcTemplate
     */
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void add(Book book) {
        String sql = "insert into t_book(book_name, book_type) values(?, ?);";
        int update = jdbcTemplate.update(sql, book.getBookName(), book.getBookType());

        System.out.println(update);
    }

    /**
     * 修改
     * @param book
     */
    @Override
    public void updateBookById(Book book, Integer bookId) {
        String sql = "update t_book set book_name=?, book_type=? where book_id=?;";
        String[] args = {book.getBookName(), book.getBookType(), bookId.toString()};
        int update = jdbcTemplate.update(sql, args);

        System.out.println(update);
    }

    /**
     * 删除
     * @param id
     */
    @Override
    public void deleteBook(Integer id) {
        String sql = "delete from t_book where book_id=?;";

        int update = jdbcTemplate.update(sql, id);

        System.out.println(update);

    }

    /**
     * 查询行数
     * @return
     */
    @Override
    public Integer rowCount() {

        String sql = "select count(*) from t_book";
        return jdbcTemplate.queryForObject(sql, Integer.class);

    }

    /**
     * 查询返回对象
     * @return
     */
    @Override
    public Book getBookById(Integer id) {
        String sql = "select * from t_book where book_id = ?";
        Book book = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Book.class), id);
        return book;
    }

    /**
     * 查询返回集合
     * @return
     */
    @Override
    public List<Book> getAllBook() {
        String sql = "select * from t_book";
        List<Book> bookList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Book.class));
        return bookList;
    }


    /**
     * 批量添加
     * @param batchArgs
     */
    @Override
    public void batchAddBook(List<Object[]> batchArgs) {
        String sql = "insert into t_book(book_name, book_type) values(?, ?);";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);

        System.out.println(Arrays.toString(ints));
    }


    @Override
    public void batchUpdate(List<Object[]> batchArgs) {

    }
}
