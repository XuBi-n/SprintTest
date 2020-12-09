package com.bdqn.util;

import org.springframework.beans.factory.FactoryBean;

public class DogFactory implements FactoryBean<Animal> {
    private  String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Animal getObject() throws Exception {
        if (type.equals("cat")){
            return  new Cat();
        }else if (type.equals("dog")){
            return  new Dog();
        }
        return null;
    }

    public Class<?> getObjectType() {
        return Animal.class;
    }

    public boolean isSingleton() {
        return true;
    }
}
