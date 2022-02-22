package com.javabasics;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
import java.util.*;


class GradeCalculation{     //change d name maybe as student

    private int rollno,cmarks,pmarks,mmarks;
    private String name;
    private int avg;


    //Constructor
    public GradeCalculation(int rollno, int cmarks, int pmarks, int mmarks, String name) {
        this.rollno = rollno;
        this.cmarks = cmarks;
        this.pmarks = pmarks;
        this.mmarks = mmarks;
        this.name = name;
    }

    //average calculation
    public int FindAverage(){        //do not capitalise function name
        this.avg=(this.cmarks+this.pmarks+this.mmarks)/3;
        System.out.println("average marks of "+this.name+" is:"+this.avg);
        return this.avg;
    }

    //Getters and Setters   //Data Encapsulation
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

    public String toString(){
        return this.getRollno() + this.getName()+this.getCmarks()+this.getMmarks()+this.getPmarks();
    }


}
public class Grade_Calculator_Oops {   //try avoding underscore
    public static void main(String[] args){
        //float average1,average2,average3,average4;
        //float cm,pm,mm,stu4;
        //float[] avg;

        GradeCalculation obj1=new GradeCalculation(101,45,55,67,"raj");
        GradeCalculation obj2=new GradeCalculation(102,65,85,77,"rajesh");
        GradeCalculation obj3=new GradeCalculation(103,43,55,60,"suraj");
        GradeCalculation obj4=new GradeCalculation(104,71,65,70,"tom");

        //System.out.println("Id:"+obj1.getRollno());
        //System.out.println("Name:"+obj1.getName());
        //System.out.println("Chemistry:"+obj1.getCmarks());
        //System.out.println("Physics:"+obj1.getPmarks());
        //System.out.println("Mathematics:"+obj1.getMmarks());

        //average1= ((obj1.getCmarks()+obj1.getPmarks()+obj1.getMmarks())/300)*100;
        //System.out.println("average of student 1 is:"+average1);

        int student1=obj1.FindAverage();
        int student2=obj2.FindAverage();
        int student3=obj3.FindAverage();
        int student4=obj4.FindAverage();



        /*
        Integer[] avg={obj1.FindAverage(), obj2.FindAverage(), obj3.FindAverage(), obj4.FindAverage()};
        int max = Collections.max(Arrays.asList(avg));
        System.out.println("Maximum Average is : "+ max);

         */

        List<GradeCalculation> list1=new LinkedList<GradeCalculation>();
        list1.add(obj1);
        System.out.println(list1);
/*
        List<Integer> listavg=new LinkedList<Integer>();
        listavg.add(student1);
        listavg.add(student2);
        listavg.add(student3);
        listavg.add(student4);


        List<String> list=new LinkedList<String>();
        list.add(obj1.getName()+":"+obj1.getRollno()+":Average Marks-"+obj1.FindAverage());
        list.add(obj2.getName()+":"+obj2.getRollno()+":Average Marks-"+obj2.FindAverage());
        list.add(obj3.getName()+":"+obj3.getRollno()+":Average Marks-"+obj3.FindAverage());
        list.add(obj4.getName()+":"+obj4.getRollno()+":Average Marks-"+obj4.FindAverage());
        System.out.println(list);

        System.out.println("Maximum Average is: "+ Collections.max(listavg));

 */


    }
    //collect student as array, pass array to some utility method, method will accept students, and will return student with max marks
}


