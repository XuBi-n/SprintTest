package com.bdqn.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Cuge {
    // @Autowired可以写在构造器,字段,方法前面
    //先按byType查找,如果找不到,再按byName查找,如果再找不到,则报错,可以使用required = false忽略报错
    //使用 @Qualifier("dog")指定对应的Bean Id,可以写在参数列表里


    private Animal animal2;

    public Animal getAnimal2() {
        return animal2;
    }
    @Autowired(required = false)
    public void setAnimal2(@Qualifier("dog") Animal animal2) {
        this.animal2 = animal2;
    }

    public void open(){
        animal2.show();
    }
}
