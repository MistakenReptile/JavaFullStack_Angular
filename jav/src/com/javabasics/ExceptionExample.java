package com.javabasics;

import java.io.EOFException;
import java.io.IOException;
import java.sql.SQLException;

public class ExceptionExample {

    void m1() throws MyException, SQLException,IOException {
        System.out.println("from m1 method");
        throw new MyException();

    }

    void m2() throws RuntimeException{
        throw new RuntimeException();
    }
    public static void main(String[] args) throws RuntimeException {
        ExceptionExample object = new ExceptionExample();
        try {
            object.m1();
            System.out.println("after throw");
        }catch(IOException | SQLException  e){
            System.out.println("u r custom mesg");
            e.printStackTrace();
        }finally {
            System.out.println("from finally");
        }

        try {
            object.m2();
            System.out.println("hi");
        }catch(RuntimeException e){
            e.printStackTrace();
        }

        try{

        }finally{

        }
        System.out.println("after the call");

    }
}

