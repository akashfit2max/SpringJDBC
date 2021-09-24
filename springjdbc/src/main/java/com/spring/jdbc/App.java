package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

public class App {
    public static void main(String[] args) {
	System.out.println("Spring JDBC");

//	getting the object

	ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/DBconfig.xml");
//	jdbctemplate is a spring predefined class
//	JdbcTemplate template = context.getBean("jbcTemplate", JdbcTemplate.class);

//	insert query
//	String query = "insert into student (id,name,city) values(?,?,?)";

//	run query
//	int res = template.update(query, 13, "anju Sahoo", "kanpur");
//	System.out.println("num of rows afected....." + res);

//	using interface

	StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
//	Student student = new Student(119, "john", "lucknow");
//	int res = studentDao.insert(student);
//	System.out.println("student added" + res);

//	updating data
//	Student student = new Student(2, "subham", "jammu");
//	int res = studentDao.chnage(student);
//	System.out.println("data updated..... " + res);

//	deleting data
	Student student = new Student(2, "subham", "jammu");
	int re = studentDao.remove(student);
	System.out.println("data removed...... " + re);

    }
}
