package com.servletproject.dao.impl;

import com.servletproject.DbUtils;
import com.servletproject.dao.AdminDao;
import com.servletproject.entity.Admin;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

/**
 * @Author: cs
 * @Date: 2021/2/6 7:28 下午
 * @Desc:
 */
public class AdminDaoImpl implements AdminDao {
    private QueryRunner queryRunner = new QueryRunner();
    @Override
    public int insert(Admin admin) {
        return 0;
    }

    @Override
    public int delete(String username) {
        return 0;
    }

    @Override
    public int update(Admin admin) {
        return 0;
    }

    @Override
    public Admin select(String username) {
        String sql = "select * from admin where username=?";
        try {
            Admin admin = queryRunner.query(DbUtils.getConnection(), sql, new BeanHandler<>(Admin.class), username);
            return admin;
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Admin> selectAll() {
        String sql = "select * from admin";
        try {
            List<Admin> adminList = queryRunner.query(DbUtils.getConnection(), sql, new BeanListHandler<>(Admin.class));
            return adminList;
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }

        return null;
    }
}
