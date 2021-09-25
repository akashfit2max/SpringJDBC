package com.spring.jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entities.Student;

public class StudentDaoImpl implements StudentDao {

    private JdbcTemplate template;

    public JdbcTemplate getTemplate() {
	return template;
    }

    public void setTemplate(JdbcTemplate template) {
	this.template = template;
    }

    @Override
    public int insert(Student student) {

	String query = "insert into student (id,name,city) values(?,?,?)";
	int res = this.template.update(query, student.getId(), student.getName(), student.getCity());
	return res;
    }

    @Override
    public int chnage(Student student) {
	// upating data

	String query = "update student set name=? , city=? where id=?";
	int r = this.template.update(query, student.getName(), student.getCity(), student.getId());
	return r;
    }

    @Override
    public int remove(int studentId) {
//	delete data from table
	String query = "delete from student where id=?";
	int re = this.template.update(query, studentId);
	return re;
    }

    @Override
    public Student selectStudent(int studentId) {
//	select single student data
//	queryforobject - single object
	String query = "select * from student where id=?";
	RowMapper<Student> rowMapper = new RowMapperImpl();
	Student student = this.template.queryForObject(query, rowMapper, studentId);
	return student;
    }

}
