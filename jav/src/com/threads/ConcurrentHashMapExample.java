package com.threads;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample extends Thread{


    static ConcurrentHashMap<Integer,String> csh=new ConcurrentHashMap<Integer,String>();
    public void run()
    {
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            System.out.println("Adding element to concurrent hashmap");
            e.printStackTrace();

        }
        csh.put(4,"xyz");

    }

    public static void main(String [] args)
    {
        csh.put(1,"7");
        csh.put(2,"8");
        csh.put(3,"9");
        ConcurrentHashMapExample cghs=new ConcurrentHashMapExample();
        cghs.start();
        for(Object o1: csh.entrySet())
        {
            Object s1=o1;
            System.out.println(s1);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

}

/*public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer,String > concurrentHashMap=new ConcurrentHashMap<>();
        concurrentHashMap.put(1,"abra");
        concurrentHashMap.put(2,"kadabra");
        concurrentHashMap.put(3,"alakhazam");
        concurrentHashMap.putIfAbsent(4,"gastly");
        System.out.println(concurrentHashMap);
    }
}*/
