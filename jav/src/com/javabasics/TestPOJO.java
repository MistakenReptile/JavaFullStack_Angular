package com.javabasics;
//POJO --> plain old java object
//Object class is parent of all the classes in java

class Student{
    private int rollno;
    private String name;

    //Constructor
    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    //Getter and Setter
    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //object reprentation
    public String toString(){
        return "This is Mr. "+ this.getName();
    }

    public void sayHello(){
        System.out.println("Hello! my name is "+this.getName());
    }
}
public class TestPOJO {
    public static void main(String[] args){
        Student student1 = new Student(101,"Rajesh");
        Student student2 = new Student(102,"Suraj");
        System.out.println(student1.getRollno());
        System.out.println(student1.getName());
        student1.sayHello();

        //System.out.println(student1); //it will print hashcode
        //System.out.println(student2);
    }
}
