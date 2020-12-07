package com.bdqn.test;

import org.springframework.beans.factory.FactoryBean;

public class MyBean implements FactoryBean<Person> {

private  String bname;

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public Person getObject() throws Exception {

        return new Person(getBname());
    }

    public Class<?> getObjectType() {
        return Person.class;
    }

    public boolean isSingleton() {
        return true;
    }
}
