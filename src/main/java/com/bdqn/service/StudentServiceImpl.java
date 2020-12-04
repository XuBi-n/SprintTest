package com.bdqn.service;

import com.bdqn.dao.StudentDaoImpl;

public class StudentServiceImpl {
    private  String name;

    @Override
    public String toString() {
        return "StudentServiceImpl{" +
                "name='" + name + '\'' +
                ", studentDao=" + studentDao +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StudentDaoImpl getStudentDao() {
        return studentDao;
    }

    public void setStudentDao(StudentDaoImpl studentDao) {
        this.studentDao = studentDao;
    }

    private StudentDaoImpl studentDao;
}
