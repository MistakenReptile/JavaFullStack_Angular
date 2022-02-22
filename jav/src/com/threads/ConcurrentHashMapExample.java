package com.threads;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer,String > concurrentHashMap=new ConcurrentHashMap<>();
        concurrentHashMap.put(1,"abra");
        concurrentHashMap.put(2,"kadabra");
        concurrentHashMap.put(3,"alakhazam");
        concurrentHashMap.putIfAbsent(4,"gastly");
        System.out.println(concurrentHashMap);
    }
}
