package com.bdqn.main;

import com.bdqn.util.Car;
import com.bdqn.util.DB;
import com.bdqn.util.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    //控制反转 IOC  面向切面 AOP（依赖注入）
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("sprint-autowire.xml");
        DB db=ctx.getBean(DB.class);
        System.out.println(db);

        Car car2= (Car) ctx.getBean("car2");
        System.out.println(car2);
//        Person person = ctx.getBean(Person.class);

//        System.out.println(person);
        ((ClassPathXmlApplicationContext)ctx).close();
    }
}
