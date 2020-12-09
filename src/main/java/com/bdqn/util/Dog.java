package com.bdqn.util;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal{

    public void show() {
        System.out.println("狗");
    }
}
