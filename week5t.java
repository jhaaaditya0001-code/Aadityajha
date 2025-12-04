
/**
 * Write a description of class week5t here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class week5t {
    public static void main(String[] args) {

        int factorial = 1;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }

        System.out.println("Factorial = " + factorial);
    }
}
