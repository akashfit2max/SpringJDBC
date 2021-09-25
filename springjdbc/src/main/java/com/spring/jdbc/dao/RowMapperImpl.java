
package com.spring.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entities.Student;

public class RowMapperImpl implements RowMapper<Student> {

//    it will give us a student objet -> isme data fetch karengai one by one / anonomus classs bhee aban skte h

    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
	Student student = new Student();
	student.setId(rs.getInt(1));
	student.setName(rs.getString(2));
	student.setCity(rs.getString(3));
	return student;
    }

}
