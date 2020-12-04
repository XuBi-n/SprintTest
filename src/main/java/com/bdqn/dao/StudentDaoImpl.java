package com.bdqn.dao;

public class StudentDaoImpl {
    private String name;
    private String sex;
    private int gradeId;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getGradeId() {
        return gradeId;
    }

    public void setGradeId(int gradeId) {
        this.gradeId = gradeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StudentDaoImpl(){
        System.out.println("我被实例化了");
    }

    public StudentDaoImpl(String name, String sex, int gradeId) {
        this.name = name;
        this.sex = sex;
        this.gradeId = gradeId;
    }

    public StudentDaoImpl(String name, String sex, double gradeId) {
        this.name = name;
        this.sex = sex;
        this.gradeId = (int)gradeId;
    }

    @Override
    public String toString() {
        return "StudentDaoImpl{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", gradeId=" + gradeId +
                '}';
    }
}
