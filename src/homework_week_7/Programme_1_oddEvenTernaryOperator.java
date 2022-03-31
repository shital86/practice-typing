package homework_week_7;
import java.util.Scanner;
/*  1. Write a java program that tells us that Input number is odd or even?
  HINT: use ternary operator (? :)*/
public class Programme_1_oddEvenTernaryOperator<number> {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int number = scanner.nextInt();
        isItoddorEvenNumber(number);
        //closing the scanner object
        scanner.close();
    }

    //Checking the number is even or odd
    public static void isItoddorEvenNumber(int number) {
        //ternary operator is used
        String evenorodd = (number % 2 == 0) ? "Even" : "odd";
        System.out.println("The "+ number + " is " +evenorodd+ " number");
    }



}
