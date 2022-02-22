package com.collections.exercises;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb2=new StringBuffer();
        System.out.println(sb2.capacity());
        sb2.insert(0, "Dataformationisabcdefghijklmnopqrstuvwxyz");
        System.out.println(sb2);
        sb2.insert(17, "abra");
        System.out.println(sb2);

        int n=sb2.indexOf("is");       //prints the index of inserted characters

        int n1=sb2.lastIndexOf("is");

        System.out.println(n1);

        sb2.reverse();   //reverse of the string
        System.out.println(sb2);
        System.out.println("---------------------------------------------------------");

        StringBuilder sb3=new StringBuilder();
        sb3.insert(0, "abra-alakhazam");
        sb3.insert(4,"-gastly");
        System.out.println(sb3);

        sb3.replace(4,11,"-kadabra");

        System.out.println(sb3);

    }
}
