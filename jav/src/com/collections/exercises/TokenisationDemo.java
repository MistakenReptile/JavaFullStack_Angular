package com.collections.exercises;

import java.util.Scanner;
import java.util.StringTokenizer;

public class TokenisationDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Strings for tokenizing");
        String tokens=sc.nextLine();

        StringTokenizer text=new StringTokenizer(tokens);
        System.out.println(text.countTokens());
    }
}
