package com.javabasics;

class Calculator_Overriding{
    public void addition(int a, int b){
        System.out.println("From Parent Class");
        System.out.println(a+b);
    }
}
class Scientific_Calculator extends Calculator_Overriding{
    public void addition(int a,int b){
        System.out.println("from child");
        System.out.println(a+b);
    }
}
public class TestPolymorphismOverriding {
    public static void main(String[] args){
        Scientific_Calculator obj = new Scientific_Calculator();
        obj.addition(5,6);  //Child -->Child

        Calculator_Overriding obj1 = new Scientific_Calculator();
        obj1.addition(2,2);  //Child -->Parent

        //Scientific_Calculator obj3 = (Scientific_Calculator) new Calculator_Overriding();
        //obj3.addition(6,6);       //Exception Handler

        Calculator_Overriding obj2 = new Calculator_Overriding();
        obj2.addition(3,3);  //Parent -->Parent
    }
}
