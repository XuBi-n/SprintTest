package com.bdqn.util;

import java.util.Map;
import java.util.Properties;

public class Person {

    private Car car;

    public Car getCar1() {
        return car;
    }

    public void setCar1(Car car) {
        this.car = car;
    }

    private Properties properties;

    public Properties getProperties() {
        return properties;
    }



    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    private Map<String,Car> cars;

    public Map<String, Car> getCars() {
        return cars;
    }

    public void setCars(Map<String, Car> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "Person{" +
                "car=" + car +
                ", properties=" + properties +
                ", cars=" + cars +
                '}';
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Car getCar() {
        return car;
    }
}
