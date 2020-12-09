package com.bdqn.util;

import org.springframework.stereotype.Service;


@Service
public class Cat implements Animal {

    public void show() {
        System.out.println("猫");
    }
}
