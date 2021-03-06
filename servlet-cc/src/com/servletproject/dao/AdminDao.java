package com.servletproject.dao;

import com.servletproject.entity.Admin;

import java.util.List;

/**
 * @Author: cs
 * @Date: 2021/2/6 7:25 下午
 * @Desc:
 */
public interface AdminDao {

    int insert(Admin admin);
    int delete(String username);
    int update(Admin admin);
    Admin select(String username);
    List<Admin> selectAll();

}
