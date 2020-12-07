package com.bdqn.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 构造块 静态块 构造方法的执行顺序 : 静态块->构造块->构造方法
 * 如果有几成的情况下实行顺序:父类静态块->子类静态块->父类构造方法->子类构造方法
 */

public class BlockTest  extends BlockBase{

    public List<String> list;
    {

        System.out.println("BlockTest 构造块");
        list=new ArrayList<String>();
    }
    public  static Map<String,String> map;
    static {
        System.out.println("BlockTest 静态块");
        map=new HashMap<String, String>();
    }

    public  BlockTest(){
        System.out.println("BlockTest 构造方法");
    }

    public static void main(String[] args) {
        BlockTest bt=new BlockTest();
    }
}
