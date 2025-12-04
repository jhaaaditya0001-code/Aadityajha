import java.util.Scanner;

/**
 * Write a description of class w5q7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class w5q7{

public static void main(String[] args){
       Scanner input = new Scanner(System.in);


        while(true){
            System.out.println("Enter 1st no: ");
            float a = input.nextFloat();

            System.out.println("Enter 2nd no: ");
            float b = input.nextFloat();
            input.nextLine();

            System.out.println("Sum: " + (a + b));
            System.out.println("Diff: " + (a - b));
            System.out.println("Product: " + (a * b));
            System.out.println("Division: " + (a / b));

            System.out.println("You want to exit? (yes or no)");
            char c = input.nextLine().charAt(0);

            if(c == 'y'){
                break;
            }
        }
    }
}