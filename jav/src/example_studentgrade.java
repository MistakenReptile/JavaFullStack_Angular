import java.util.Scanner;

public class example_studentgrade {

    public static void Grade_calculator(){
        Scanner myObj = new Scanner(System.in);
        int marks;

        System.out.println("Enter Marks:");
        marks= myObj.nextInt();

        if(marks>=90 && marks<=100){
            System.out.println(" A Grade ");
        }
        else if (marks<90 && marks>=80){
            System.out.println(" B Grade");
        }
        else if(marks<80 && marks >=70){
            System.out.println(" C Grade");
        }
        else if (marks>=0 && marks<70){
            System.out.println(" Average Grade ");
        }
        else if (marks>100){
            System.out.println(" Input Error ");
        }
        else{
            System.out.println("Input Error");
        }
    }
    public static void main(String[] args) {

        Grade_calculator();
    }
}
