package com.servletproject.service.impl;

import com.servletproject.DbUtils;
import com.servletproject.dao.AdminDao;
import com.servletproject.dao.impl.AdminDaoImpl;
import com.servletproject.entity.Admin;
import com.servletproject.service.AdminService;

import java.util.List;

/**
 * @Author: cs
 * @Date: 2021/2/6 8:15 下午
 * @Desc:
 */
public class AdminServiceImpl implements AdminService {

    private AdminDao adminDao = new AdminDaoImpl();

    @Override
    public Admin login(String username, String password) {
        Admin result = null;

        try {
            DbUtils.begin();
            Admin admin = adminDao.select(username);

            if (admin != null) {
                if (admin.getPassword().equals(password)) {
                    result = admin;
                }
            }

            DbUtils.commit();
        } catch (Exception e) {
            DbUtils.rollback();
            e.printStackTrace();
        }

        return result;
    }

    @Override
    public List<Admin> showAllAdmin() {
        List<Admin> adminList = null;

        try {
            DbUtils.begin();
            adminList = adminDao.selectAll();
            DbUtils.commit();
        } catch (Exception e) {
            DbUtils.rollback();
            e.printStackTrace();
        }
        return adminList;
    }
}
