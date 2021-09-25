package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

public class App {
    public static void main(String[] args) {
	System.out.println("Spring JDBC");

//	getting the object

//	ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/DBconfig.xml");

//	using javaConfig rather than using xml
	ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);

//	jdbctemplate is a spring predefined class
//	JdbcTemplate template = context.getBean("jbcTemplate", JdbcTemplate.class);

//	insert query
//	String query = "insert into student (id,name,city) values(?,?,?)";

//	run query
//	int res = template.update(query, 13, "anju Sahoo", "kanpur");
//	System.out.println("num of rows afected....." + res);

//	using interface studentDao jisme are insert,delete,update,selecrt operations gho rahe h

	StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

//	insert data
//	Student student = new Student(110, "mari", "lucknow");
//	int res = studentDao.insert(student);
//	System.out.println("student added" + res);

//	updating data
//	Student student = new Student(2, "subham", "jammu");
//	int res = studentDao.chnage(student);
//	System.out.println("data updated..... " + res);

//	deleting data
//	Student student = new Student();
//	student.setId(19);
//	int re = studentDao.remove(student.getId());
//	System.out.println("data removed...... " + re);

//	Student student = studentDao.selectStudent(23);
//	System.out.println(student);

	System.out.println();
	System.out.println("all students");
	List<Student> allStudents = studentDao.selectAllStudents();
//	System.out.println(allStudents);
	for (Student s : allStudents) {
	    System.out.println(s);
	}

    }
}
