package com.bdqn.test;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Properties;
@Repository
public class Person {


    public  static  final String PID="PersonID";

    public Person(String name) {
        this.name = name;
    }

    private  String name;

    private List<String> names;

    private Properties properties;

    public  void init(){
        System.out.println("person init");
    }

    public  void destroy(){
        System.out.println("person destroy");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", names=" + names +
                ", properties=" + properties +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
