package com.bdqn.main;

import com.bdqn.test.Demp;
import com.bdqn.test.Person;
import com.bdqn.util.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    //控制反转 IOC  面向切面 AOP（依赖注入）
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("spring-ioc.xml");
        Cuge cuge= (Cuge) ctx.getBean("cuge");
        cuge.open();




//        Person person=(Person)ctx.getBean("person");
//        Person person1=(Person)ctx.getBean("person2");
//        Person person2=(Person)ctx.getBean("person3");
//        System.out.println(person);
//        System.out.println(person1);
//        System.out.println(person2);
//        Demp demp= (Demp) ctx.getBean("demp");
//        System.out.println(demp );
//
//
////        Car car2= (Car) ctx.getBean("car2");
////        System.out.println(car2);
////        Person person = ctx.getBean(Person.class);
//
////        System.out.println(person);
////        ((ClassPathXmlApplicationContext)ctx).close();
//        ((ClassPathXmlApplicationContext)ctx).close();
    }
}
