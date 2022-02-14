package com.javabasics;

//polymorphism --> using one thing in multiple ways
//overloading --> same name method with different type or number of parameter

class Calculator_Polymorphism{
    public void addition(int a,int b){
        System.out.println(a+b);
    }
    public void addition(int a,int b,int c){
        System.out.println(a+b+c);
    }
    public void addition(float a,float b){
        System.out.println(a+b);
    }
    //return type has no impact on overloading
    /*
    public int addition(int a,int b){
        System.out.println(a+b);
        return a+b;
    }
     */
}
public class TestPolymorphismOverloading {
    public static void main(String[] args){
        Calculator_Polymorphism obj = new Calculator_Polymorphism();
        obj.addition(1,1);
        obj.addition(1,1,1);
        obj.addition(1.5f, 1.5F);
    }
}
