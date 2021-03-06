package com.javabasics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
    static void HashMapMethod(){

        Map<Integer,String> map = new HashMap<Integer, String>();
        map.put(1,"Manisha");
        map.put(2,"Daksh");
        map.put(3,"Harshada");
        map.put(1,"PQR");

        System.out.println("==========by using entrySet================");
        Set<Map.Entry<Integer,String>> entrySet =  map.entrySet();
        for(Map.Entry<Integer,String> entry : entrySet){
            System.out.println(entry.getKey()+"  "+entry.getValue());
        }

        System.out.println("===================key set ==============");
        Set<Integer> keySet =  map.keySet();
        for(Integer key : keySet){
            System.out.println(key +"  "+map.get(key));
        }

        System.out.println("======================Iterator ======================");
        Iterator<Map.Entry<Integer,String>> itrEntry = entrySet.iterator();
        while(itrEntry.hasNext()){
            Map.Entry<Integer,String> entry = itrEntry.next();
            System.out.println(entry.getKey()+"  "+entry.getValue());
        }
        System.out.println("============for each=============");
        map.forEach((p,q)-> System.out.println(p+"  "+q));
    }
    public static void main(String[] args) {
        HashMapMethod();
    }
}
@FunctionalInterface
interface A{
    void m1(int a);
    default void m2(){
    }
    static void m3(){
    }
}

class ABC {
    public static void main(String[] args) {
        A obj = new A() {
            @Override
            public void m1(int a) {
                System.out.println("from m1");
            }
        };
        A obj1 =
                (y) -> {
                    System.out.println("from m1 from obj1  "+y);
                };

        obj1.m1(7);
    }
}


