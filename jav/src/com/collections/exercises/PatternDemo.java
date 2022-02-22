package com.collections.exercises;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// REGEX
public class PatternDemo {
    public static void main(String[] args) {

        /*Pattern p=Pattern.compile("@");
        Matcher m=p.matcher("@gmail");
        System.out.println(m.matches());*/

        System.out.println(Pattern.matches("abcd*ef", "abcdef"));

        System.out.println(Pattern.matches("abcdef*", "abcdef"));

//searching particular pattern

        Pattern pat=Pattern.compile(".com");

        Matcher m1=pat.matcher("mgavalemgavale@gmail.com");
//^[a-zA-Z0-9+_,.-]+@[a-zA-Z0-9.-]
//^matching the starting of sentence
//[a-zA-Z0-9.-]matches one character from alphabets,digits,+_,.- before @ symbol
//+ indicates above set for one or more times
//@matches itself
//[a-zA-Z0-9.-] matches one character from the English alphabet  digits, . and -after @ symbol


        while(m1.find())
        {
            System.out.println(m1.start() );
            System.out.println(m1.end()-1 );

        }

    }
}
