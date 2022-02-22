package com.javabasics;

import java.util.*;

public class CollectionExample {
    static  void ArrayListMethod(){
        List<String> list = new ArrayList<String>();
        list.add("Manisha");
        list.add("Daksh");
        list.add("Harshada");

        for(String s : list){
            System.out.println(s);
        }
    }

    static  void LinkedListMethod(){
        List<String> list = new LinkedList<>();
        list.add("Manisha");
        list.add("Daksh");
        list.add("Harshada");
        System.out.println("=============================Linked list ===========================");
        for(String s : list){
            System.out.println(s);
        }
    }
    static void DequeExample(){

        Deque<String> queue = new ArrayDeque<String>();
        queue.add("Manisha");
        queue.add("Daksh");
        queue.add("Harshada");
        queue.addFirst("1234");    // method to add an element
        queue.addLast("pqr");

        queue.removeFirst();         //method to remove and element

        System.out.println("=====================Deque=======================");
        Iterator<String> itr = queue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    static void hasSetMethod(){
        Set<String> set = new HashSet<String>();
        set.add("Manisha");
        set.add("Daksh");
        set.add("Harshada");
        set.add("Manisha");
        System.out.println("===========================set ===========================");
        for(String s : set){
            System.out.println(s);
        }
        System.out.println("=============================by using iterator ===========================");
        Iterator<String> itr = set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    static void LinkedSetMethod(){               //LINKED SET METHOD
        Set<String> set = new LinkedHashSet<>();
        set.add("Manisha");
        set.add("Daksh");
        set.add("Harshada");
        set.add("Manisha");
        System.out.println("===========================set ===========================");
        for(String s : set){
            System.out.println(s);
        }
        System.out.println("=============================by using iterator ===========================");
        Iterator<String> itr = set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    static void TreeSetMethod(){              //TREE SET METHOD
        Set<String> set = new TreeSet<>();
        set.add("Manisha");
        set.add("Daksh");
        set.add("Harshada");
        set.add("Manisha");
        System.out.println("===========================set ===========================");
        for(String s : set){
            System.out.println(s);
        }
        System.out.println("=============================by using iterator ===========================");
        Iterator<String> itr = set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }


    public static void main(String[] args) {
        ArrayListMethod();
        LinkedListMethod();
        DequeExample();
        hasSetMethod();
        System.out.println("LINKED SET METHOD");
        LinkedSetMethod();
        System.out.println("TREE SET METHOD");
        TreeSetMethod();
    }
}



