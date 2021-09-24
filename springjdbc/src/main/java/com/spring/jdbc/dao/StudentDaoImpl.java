package com.spring.jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.entities.Student;

public class StudentDaoImpl implements StudentDao {

    private JdbcTemplate template;

    public JdbcTemplate getTemplate() {
	return template;
    }

    public void setTemplate(JdbcTemplate template) {
	this.template = template;
    }

    public int insert(Student student) {

	String query = "insert into student (id,name,city) values(?,?,?)";
	int res = this.template.update(query, student.getId(), student.getName(), student.getCity());
	return res;
    }

}
