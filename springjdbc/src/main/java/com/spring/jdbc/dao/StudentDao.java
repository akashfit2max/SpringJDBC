package com.spring.jdbc.dao;

import com.spring.jdbc.entities.Student;

public interface StudentDao {

    public int insert(Student student);

    public int chnage(Student student);

    public int remove(int studentId);

    public Student selectStudent(int studentId);

}
