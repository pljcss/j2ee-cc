package com.servletproject.service;

import com.servletproject.entity.Admin;

import java.util.List;

/**
 * @Author: cs
 * @Date: 2021/2/6 8:14 下午
 * @Desc:
 */
public interface AdminService {
    Admin login(String username, String password);

    List<Admin> showAllAdmin();

}
