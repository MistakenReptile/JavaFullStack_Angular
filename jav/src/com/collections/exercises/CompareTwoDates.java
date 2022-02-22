package com.collections.exercises;

import java.util.Date;

public class CompareTwoDates {
    public static void main(String[] args) {
        Date d1,d2,d3,d4,d5,d6;
        d1=new Date(2020,3,5);
        d2=new Date(2020,2,2);
        d3=new Date(2021,5,25);
        d4=new Date(2021,5,25);
        d5=new Date(2022,9,30);
        d6=new Date(2022,12,9);
        System.out.println("result for 'before' method "+d1.before(d2));
        System.out.println("result for 'equals' method "+d3.equals(d4));
        System.out.println("result for 'after' method "+d5.after(d6));

        System.out.println("using compare to method:"+d2.compareTo(d1));
        System.out.println("using compare to method:"+d3.compareTo(d4));
        System.out.println("using compare to method:"+d5.compareTo(d6));

        System.out.println("time passed since "+d6+" is "+d5.getTime());
    }
}
