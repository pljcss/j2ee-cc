package com.iocdemo.xml;

/**
 * @Author: cs
 * @Date: 2021/1/25 9:12 下午
 * @Desc:
 */
public class User {
    private String userName;

    public User() {
        System.out.println("无参构造.....");
    }

    public User(String userName) {
        System.out.println("有惨构造.....");
        this.userName = userName;
    }

    public void sayHi() {
        System.out.println("hello world");
    }
}
