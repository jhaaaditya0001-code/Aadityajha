
/**
 * Write a description of class w5q5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class w5q5
{
      public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {

            for (int s = 1; s <= 6 - i; s++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
    
    
    
}