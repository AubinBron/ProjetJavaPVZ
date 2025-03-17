package com.oxyl.coursepfback.persistance.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class DAO {
    private static AppConfig appConfig = new AppConfig();
    protected static JdbcTemplate jdbcTemplate = appConfig.initJdbcTemplate();
    public DAO() {
    }

}
