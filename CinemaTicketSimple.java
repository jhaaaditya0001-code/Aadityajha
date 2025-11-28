import java.util.*;

public class CinemaTicketSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double price = 0;

        // AGE
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        if (age < 12) {
            price = 150;      // Child
        } else if (age <= 59) {
            price = 250;      // Adult
        } else {
            price = 200;      // Senior
        }

        // MOVIE LANGUAGE
        System.out.print("Enter movie language (nepali / hindi / english): ");
        String lang = sc.next().toLowerCase();

        if (lang.equals("hindi")) {
            price = price + 50;
        }
        if (lang.equals("english")) {
            price = price + 100;
        }

        // STUDENT
        System.out.print("Are you a student? (yes/no): ");
        String student = sc.next().toLowerCase();

        if (student.equals("yes")) {
            price = price - (price * 0.20);
        }

        // FESTIVAL
        System.out.print("Is it a festival day? (yes/no): ");
        String fest = sc.next().toLowerCase();

        if (fest.equals("yes")) {
            price = price - (price * 0.15);
        }

        // OUTPUT
        System.out.println("Final Ticket Price: Rs. " + price);
    }
}
