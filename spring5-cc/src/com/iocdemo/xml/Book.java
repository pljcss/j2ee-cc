package com.iocdemo.xml;

/**
 * @Author: cs
 * @Date: 2021/1/27 1:32 下午
 * @Desc:
 */
public class Book {
    private String bookName;
    private String bookAuthor;
    private String address;
    private String bookType;

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBookName() {
        return bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public String getAddress() {
        return address;
    }

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }
}
