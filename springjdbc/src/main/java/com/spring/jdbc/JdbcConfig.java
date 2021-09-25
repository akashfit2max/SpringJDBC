package com.spring.jdbc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.dao.StudentDaoImpl;

@Configuration
public class JdbcConfig {

    @Bean(name = "ds")
    public DriverManagerDataSource getDataSource() {
	DriverManagerDataSource ds = new DriverManagerDataSource();
	ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
	ds.setUrl("jdbc:mysql://localhost:3306/akash");
	ds.setUsername("root");
	ds.setPassword("aks123");
	return ds;
    }

    @Bean(name = "jdbcTemplate")
    public JdbcTemplate geJdbcTemplate() {
	JdbcTemplate jdbcTemplate = new JdbcTemplate();
	jdbcTemplate.setDataSource(getDataSource());
	return jdbcTemplate;
    }

    @Bean(name = "studentDao")
    public StudentDao getsStudentDao() {
	StudentDaoImpl studentDaoImpl = new StudentDaoImpl();
	studentDaoImpl.setTemplate(geJdbcTemplate());
	return studentDaoImpl;
    }
}
