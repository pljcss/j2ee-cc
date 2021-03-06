package com.transactiondemo2.txconfig;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @Author: cs
 * @Date: 2021/2/3 1:15 下午
 * @Desc: 完全注解开发 配置类
 */
@Configuration // 配置类
@ComponentScan(basePackages = "com.transactiondemo2") // 组件扫描
@EnableTransactionManagement //开启事务
public class TxConfig {
    /**
     * 创建数据库连接池
     */
    @Bean
    public DruidDataSource getDruidDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:12345/test_db");
        dataSource.setUsername("root");
        dataSource.setPassword("123456");

        return dataSource;
    }


    /**
     * 创建JdbcTemplate 对象
     * @return
     */
    @Bean
    public JdbcTemplate getJdbcTemplate(DataSource dataSource) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();

        // 注入DataSource
        jdbcTemplate.setDataSource(dataSource);

        return jdbcTemplate;
    }

    /**
     * 创建事务管理器 对象
     * @return
     */
    @Bean
    public DataSourceTransactionManager getDataSourceTransactionManager(DataSource dataSource) {
        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();

        // 注入DataSource
        transactionManager.setDataSource(dataSource);

        return transactionManager;
    }
}
