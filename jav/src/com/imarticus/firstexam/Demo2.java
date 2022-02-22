package com.imarticus.firstexam;
import java.util.Scanner;

public class Demo2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Student Details in \t'roll:name:marks'\tpattern");
        String details = sc.nextLine();

        String[] dArray = details.split(":",5);

        int marksArray[] = new int[dArray.length];
        marksArray[0] = Integer.parseInt(dArray[2]);

        if(marksArray[0] >=500){
            System.out.println("Student Roll is : "+dArray[0]+"\nStudent Name is : "+dArray[1]+"\nStudent Marks is : "+marksArray[0]+"\nStudent Result is : Pass");
        }
        else{
            System.out.println("Student Roll is : "+dArray[0]+"\nStudent Name is : "+dArray[1]+"\nStudent Marks is : "+marksArray[0]+"\nStudent Result is : Fail");
        }
    }
}
