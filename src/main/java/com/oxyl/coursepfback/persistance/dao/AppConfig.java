package com.oxyl.coursepfback.persistance.dao;

import org.springframework.context.annotation.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


import javax.sql.DataSource;

@Configuration
@ComponentScan("com.oxyl.coursepfback")
public class AppConfig {

    @Bean
    public DataSource initDataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/pvz");
        dataSource.setUsername("epf");
        dataSource.setPassword("Aubin");
        return dataSource;
    }

    @Bean
    public JdbcTemplate initJdbcTemplate(){
        JdbcTemplate jdbcTemplate = new JdbcTemplate(initDataSource());
        return jdbcTemplate;
    }
}
