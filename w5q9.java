import java.util.Scanner;

/**
 * Write a description of class w5q9 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class w5q9{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a no: ");
        int n = input.nextInt();

        int r = 0;
        int s = 0;

        while(n != 0){
            r = n % 10;
            s = s * 10 + r;
            n = n / 10;
        }

        System.out.println("Reversed Number is " + s);
    }
}
