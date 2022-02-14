package com.student;


import java.util.ArrayList;

class Student{

    private int rollno,cmarks,pmarks,mmarks;
    private String name;
    private String department;
    private int avg;

    public Student(int rollno, int cmarks, int pmarks, int mmarks, String name,String department) {
        this.rollno = rollno;
        this.cmarks = cmarks;
        this.pmarks = pmarks;
        this.mmarks = mmarks;
        this.name = name;
        this.department = department;

    }
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public int getCmarks() {
        return cmarks;
    }

    public void setCmarks(int cmarks) {
        this.cmarks = cmarks;
    }

    public int getPmarks() {
        return pmarks;
    }

    public void setPmarks(int pmarks) {
        this.pmarks = pmarks;
    }

    public int getMmarks() {
        return mmarks;
    }

    public void setMmarks(int mmarks) {
        this.mmarks = mmarks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int findAverage(){
        this.avg=(this.cmarks+this.pmarks+this.mmarks)/3;
        //System.out.println("average marks of "+this.name+" is:"+this.avg);
        return this.avg;
    }

    public String toString(){
        return this.getRollno() + this.getName();
    }


}
interface CollegeHireable {

    void suitableToHire(int mmarks, String dpt, int avg);

}

class FacebookHR implements CollegeHireable{

    @Override
    public void suitableToHire(int mmarks, String dpt, int avg) {
        if(mmarks>=60 &&(dpt=="CSE" || dpt=="ISE")&& avg>=50){
            System.out.println("Congratulations! You Got into Facebook!");
        }
        else{
            System.out.println("Better Luck next Time!");
        }

    }
}

class GoogleHR implements CollegeHireable{

    @Override
    public void suitableToHire(int mmarks, String dpt, int avg) {
        if(mmarks>=70 && dpt=="CSE" || dpt=="ISE" && avg>=60){
            System.out.println("Congratulations! You Got into Google!\n");
        }
        else{
            System.out.println("Better Luck next Time!");
        }
    }
}

class AmazonHR implements CollegeHireable{

    @Override
    public void suitableToHire(int mmarks, String dpt, int avg) {
        if(mmarks>=50 && dpt=="CSE" || dpt=="ISE" && avg>=50){
            System.out.println("Congratulations! You Got into Amazon!\n");
        }
        else{
            System.out.println("Better Luck next Time!");
        }
    }
}

public class StudentPlacement {
    public static void main(String[] args){
        Student obj1=new Student(101,45,55,67,"raj","CSE");
        Student obj2=new Student(102,65,85,77,"rajesh","ISE");
        Student obj3=new Student(103,43,55,60,"suraj","MECHANICAL");
        Student obj4=new Student(104,71,65,70,"tom","CSE");


        //System.out.println(obj1.findAverage());

        FacebookHR fb=new FacebookHR();
        GoogleHR google=new GoogleHR();
        AmazonHR amazon=new AmazonHR();

        ArrayList<Student> name=new ArrayList<Student>();
        name.add(obj1);
        System.out.println(name.get(0));

        //String s=fb.toString();

        //Facebook Data
        /*
        System.out.println(obj1.getName());
        fb.suitableToHire(obj1.getMmarks(), obj1.getDepartment(), obj1.findAverage());
        System.out.println(obj2.getName());
        fb.suitableToHire(obj2.getMmarks(), obj2.getDepartment(), obj2.findAverage());
        System.out.println(obj3.getName());
        fb.suitableToHire(obj3.getMmarks(), obj3.getDepartment(), obj3.findAverage());
        System.out.println(obj4.getName());
        fb.suitableToHire(obj4.getMmarks(), obj4.getDepartment(), obj4.findAverage());


        //Google Data
        System.out.println(obj1.getName());
        google.suitableToHire(obj1.getMmarks(), obj1.getDepartment(), obj1.findAverage());
        System.out.println(obj2.getName());
        google.suitableToHire(obj2.getMmarks(), obj2.getDepartment(), obj2.findAverage());
        System.out.println(obj3.getName());
        google.suitableToHire(obj3.getMmarks(), obj3.getDepartment(), obj3.findAverage());
        System.out.println(obj4.getName());
        google.suitableToHire(obj4.getMmarks(), obj4.getDepartment(), obj4.findAverage());

         */

        //Amazon Data
        System.out.println(obj1.getName());
        amazon.suitableToHire(obj1.getMmarks(), obj1.getDepartment(), obj1.findAverage());
        System.out.println(obj2.getName());
        amazon.suitableToHire(obj2.getMmarks(), obj2.getDepartment(), obj2.findAverage());
        System.out.println(obj3.getName());
        amazon.suitableToHire(obj3.getMmarks(), obj3.getDepartment(), obj3.findAverage());
        System.out.println(obj4.getName());
        amazon.suitableToHire(obj4.getMmarks(), obj4.getDepartment(), obj4.findAverage());

        //System.out.println(s);


    }
}
