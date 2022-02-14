package com.javabasics;

//IS-A relationship and HAS-A relationship

//inheritance --> taking parent's properties
//multi level inheritance --> Grandparent --> Parent --> child
//multiple inheritance --> having two parent classess

//Parent Class
class Calculator_Inheritance {
    public void addition(int x, int y) {
        System.out.println(x + y);
    }
}

//Child Class
class ScientificCalculator extends Calculator_Inheritance{
    public void areaCube(int side){
        System.out.println(side*side);
    }
}

public class TestInheritance {
    public static void main(String[] args){
        Calculator_Inheritance obj1 = new ScientificCalculator();
        obj1.addition(1,1);  //Parent Cannot Access Child Features

        //ScientificCalculator obj2= (ScientificCalculator) new Calculator_Inheritance();
        //obj2.areaCube(2);     //Exception Handle

        ScientificCalculator obj3=new ScientificCalculator();
        obj3.areaCube(2);
        obj3.addition(2,2);   //Child Class can have Access to Parent CLass

        Calculator_Inheritance obj4=new Calculator_Inheritance();
        obj4.addition(3,3);   //Parent Class can have access to its own class
    }
}
