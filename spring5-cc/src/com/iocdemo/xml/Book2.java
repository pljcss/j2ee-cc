package com.iocdemo.xml;

/**
 * @Author: cs
 * @Date: 2021/1/27 1:32 下午
 * @Desc:
 */
public class Book2 {
    private String bookName;
    private String bookAuthor;

    public Book2(String bookName, String bookAuthor) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
    }

    public String getBookName() {
        return bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }
}
