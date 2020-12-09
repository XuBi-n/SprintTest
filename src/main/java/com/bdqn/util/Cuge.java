package com.bdqn.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Cuge {
    //先按byType查找,如果找不到,再按byName查找,如果再找不到,则报错,可以使用required = false忽略报错
    @Autowired
    private Animal animal2;


    public void open(){
        animal2.show();
    }
}
