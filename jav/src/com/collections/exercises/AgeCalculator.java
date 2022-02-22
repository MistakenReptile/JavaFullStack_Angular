package com.collections.exercises;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

class AgeOfPerson{
    void calculateAge(){
        System.out.println("Enter DOB in YYYY-MM-DD format");
        Scanner scanner=new Scanner(System.in);
        //reads the date of birth from the user
        String input = scanner.nextLine();
        scanner.close();

        LocalDate dob=LocalDate.parse(input);
        System.out.println("You are "+calculateAge(dob)+"years old");
    }

    public static int calculateAge(LocalDate dob)
    {
//creating an instance of the LocalDate class and invoking the now() method
//now() method obtains the current date from the system clock in the default time zone
        LocalDate curDate = LocalDate.now();
//calculates the amount of time between two dates and returns the years
        if ((dob != null) && (curDate != null))
        {
            return Period.between(dob, curDate).getYears();
        }
        else
        {
            return 0;
        }
    }
}
public class AgeCalculator {
    public static void main(String[] args) {
        AgeOfPerson ageOfPerson=new AgeOfPerson();
        ageOfPerson.calculateAge();

        //obtains an instance of LocalDate from a year, month and date
        LocalDate dob = LocalDate.of(2000, 05, 9);
        //obtains the current date from the system clock
        LocalDate curDate = LocalDate.now();
        //calculates the difference between two dates
        Period period = Period.between(dob, curDate);
        //prints the difference in years, months, and days
        System.out.printf("Your age is %d years %d months and %d days.", period.getYears(), period.getMonths(), period.getDays());
    }
}
