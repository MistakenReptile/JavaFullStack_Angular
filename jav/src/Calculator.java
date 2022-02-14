import java.util.Scanner;

class Simple_Calculator{
    int choice;
    float first_number,second_number,total=0;

    void Calc(){
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter Choice: \n 1:Addition\n2:Subtraction\n3:Multiplication\n4:Division\n");
        choice = myObj.nextInt();
        System.out.println("Enter First Number:");
        first_number = myObj.nextFloat();
        System.out.println("Enter Second Number:");
        second_number = myObj.nextFloat();

        if (choice == 1) {
            total=first_number+second_number;
            System.out.println(" Total is: "+first_number+"+"+second_number+" = "+total);
        }
        else if (choice == 2) {
            total=first_number-second_number;
            System.out.println(" Total is: "+first_number+"-"+second_number+" = "+total);
        }
        else if (choice == 3) {
            total=first_number*second_number;
            System.out.println(" Total is: "+first_number+"x"+second_number+" = "+total);
        }
        else if (choice == 4) {
            total=first_number/second_number;
            System.out.println(" Total is: "+first_number+"/"+second_number+" = "+total);
        }
        else {
            System.out.println(" Invalid Choice: ");
        }

    }
}

public class Calculator {

    public static void main(String[] args){
        Simple_Calculator simple_calculator=new Simple_Calculator();
        simple_calculator.Calc();
    }
}