package com.jdbctemplatedemo.entity;

/**
 * @Author: cs
 * @Date: 2021/2/1 12:45 下午
 * @Desc: 对应数据库中的 t_user表
 */
public class Book {
    private String bookId;
    private String bookName;
    private String bookType;

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    public Book() {
    }

    public Book(String bookId, String bookName, String bookType) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookType = bookType;
    }


    @Override
    public String toString() {
        return "Book{" +
                "bookId='" + bookId + '\'' +
                ", bookName='" + bookName + '\'' +
                ", bookType='" + bookType + '\'' +
                '}';
    }
}
