package com.javabasics;
import java.util.Arrays;

class Students{

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


}
public class SortingStudents {
    public static void main(String[] args){
        Students obj1=new Students("raj",101);
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

        // Calling the inbuilt sort() function
        Arrays.sort(arrayid);
        Arrays.sort(arrayname);


        System.out.printf("Sorting based on ID Numbers : %s\n",Arrays.toString(arrayid));
        System.out.printf("Sorting based on Names : %s",Arrays.toString(arrayname));


    }
}
