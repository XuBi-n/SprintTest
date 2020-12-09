package com.bdqn.util;
//工厂类
public class AnimalFactory {
    public   Animal getAnimal(String type){
        if (type.equals("cat")){
            return  new Cat();
        }else if (type.equals("dog")){
            return  new Dog();
        }
        return null;
    }
}
