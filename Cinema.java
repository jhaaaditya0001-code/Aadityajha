import java.util.*;

public class Cinema{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double price = 0;

        // ----- AGE -----
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        if (age < 12) {
            price = 150;     // Child
        } else if (age <= 59) {
            price = 250;     // Adult
        } else {
            price = 200;     // Senior
        }

        // ----- LANGUAGE -----
        System.out.print("Enter movie language (nepali / hindi / english): ");
        String lang = sc.next().toLowerCase();

        if (lang.equals("hindi")) {
            price += 50;
        }
        else if (lang.equals("english")) {
            price += 100;
        }
        // nepali = no extra

        // ----- STUDENT DISCOUNT -----
        System.out.print("Are you a student? (yes/no): ");
        String student = sc.next().toLowerCase();

        if (student.equals("yes")) {
            price = price - (price * 0.20); // 20% off
        }

        // ----- FESTIVAL DISCOUNT -----
        System.out.print("Is it a festival today? (yes/no): ");
        String fest = sc.next().toLowerCase();

        if (fest.equals("yes")) {
            price = price - (price * 0.15); // 15% off
        }

        // ----- FINAL OUTPUT -----
        System.out.println("Final Ticket Price = Rs. " + price);
    }
}
