package com.collections.exercises;

import java.util.*;

public class TestGenericConversion {
    public static void main(String[ ] args){
        List<String> list=new ArrayList<String>( );
        list.add("one");
//        list.add(2);    //Original Line --> Throws error

        list.add("2");  //Corrected line
        System.out.println(list.get(0).length());
    }
}

