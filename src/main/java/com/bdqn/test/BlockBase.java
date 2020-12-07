package com.bdqn.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BlockBase {
    public List<String> list;
    {

        System.out.println("BlockBase 构造块");
        list=new ArrayList<String>();
    }
    public  static Map<String,String> map;
    static {
        System.out.println("BlockBase 静态块");
        map=new HashMap<String, String>();
    }

    public  BlockBase(){
        System.out.println("BlockBase 构造方法");
    }
}
