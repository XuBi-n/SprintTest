package com.bdqn.util;

public class Car {
    private  String name;
    private String type;
    private  double speed;


    public void init(){
        System.out.println("car 的初始化方法");
    }

    public  void destroy(){
        System.out.println("car 的销毁方法");
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public Car() {
    }

    public Car(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", speed=" + speed +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
