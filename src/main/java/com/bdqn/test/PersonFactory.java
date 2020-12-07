package com.bdqn.test;

import java.util.HashMap;
import java.util.Map;

public class PersonFactory {
    private  static Map<String,Person> map;
    static {
        map=new HashMap<String, Person>();
        map.put("p1",new Person("张三"));
        map.put("p2",new Person("李四"));
        map.put("p3",new Person("王五"));
    }
    public  static  Person getPerson(String key){
        return  map.get(key);
    }
}
