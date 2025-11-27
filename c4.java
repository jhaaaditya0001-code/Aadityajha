
/**
 * Write a description of class c4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class c4 {
    public static void main(String[] args) {
        int num = 25;

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("Divisible by both 3 and 5");
        }
        else if (num % 3 == 0) {
            System.out.println("Divisible by 3 but not by 5");
        }
        else if (num % 5 == 0) {
            System.out.println("Divisible by 5 but not by 3");
        }
        else {
            System.out.println("Not divisible by 3 or 5");
        }
    }
}
