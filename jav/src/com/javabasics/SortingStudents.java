package com.javabasics;
import java.security.Key;
import java.util.*;
import java.util.stream.Stream;

class Students implements Comparable<Students>{

    private String name;
    private int id;

    //Constructor
    public Students(String name, int id) {
        this.name = name;
        this.id = id;
    }

    //Getters and Setters   //Encapsulation
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String toString(){
        return this.getId() +" "+ this.getName();
    }


    @Override
    public int compareTo(Students o) {
        return this.getName().compareTo(o.getName());
    }
}
public class SortingStudents {
    public static void main(String[] args){
        Students obj1=new Students("tom",101);
        Students obj2=new Students("zzu",121);
        Students obj3=new Students("suraj",130);
        Students obj4=new Students("tom",114);

        /*
        int s1=obj1.getId();
        int s2=obj1.getId();
        int s3=obj1.getId();
        int s4=obj1.getId();

         */

        int[] arrayid={obj1.getId(), obj2.getId(), obj3.getId(), obj4.getId()};
        String[] arrayname={obj1.getName(), obj2.getName(), obj3.getName(), obj4.getName()};

        ArrayList<Students> student1=new ArrayList<Students>();
        student1.add(obj1);
        student1.add(obj2);
        student1.add(obj3);
        student1.add(obj4);

        System.out.println(student1);
        Collections.sort(student1); //based on name
        System.out.println(student1);

        TreeMap<Integer,Students> treeMap=new TreeMap<>();
        treeMap.put(101,obj1);
        treeMap.put(121,obj2);
        treeMap.put(130,obj3);
        treeMap.put(114,obj4);
        System.out.println("\ntree map\n"+treeMap);

        TreeSet<Students> treeSet=new TreeSet<>();
        treeSet.add(obj1);
        treeSet.add(obj2);
        treeSet.add(obj3);
        treeSet.add(obj4);
        System.out.println("\ntree set\n"+treeSet);


        //Comparator<Students> comparator=Comparator.comparing(students -> students.getName());
        //comparator=comparator.thenComparing(Comparator.comparing(students -> students.getId()));

        //Stream<Students> studentsStream=student1.stream().sorted(comparator);


        // Calling the inbuilt sort() function
        //Arrays.sort(arrayid);
        //Arrays.sort(arrayname);


        //System.out.printf("Sorting based on ID Numbers : %s\n",Arrays.toString(arrayid));
        //System.out.printf("Sorting based on Names : %s",Arrays.toString(arrayname));


    }
}
