import java.util.*;

public class CinemaTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----- XFX Cinema Ticket System -----");

        // 1. Input movie language
        System.out.println("Choose Movie Language:");
        System.out.println("1. Nepali");
        System.out.println("2. Hindi");
        System.out.println("3. English");
        System.out.print("Enter choice (1–3): ");
        int langChoice = sc.nextInt();

        double basePrice = 0;

        // Movie language price
        switch (langChoice) {
            case 1:
                basePrice = 250; // Nepali movies cheaper
                break;
            case 2:
                basePrice = 300; // Hindi movies medium price
                break;
            case 3:
                basePrice = 400; // English movies highest price
                break;
            default:
                System.out.println("Invalid movie selection!");
                return;
        }

        // 2. Age Group Pricing
        System.out.println("\nSelect Age Group:");
        System.out.println("1. Child (Below 12)");
        System.out.println("2. Adult (13–59)");
        System.out.println("3. Senior (60+)");
        System.out.print("Enter choice (1–3): ");
        int ageChoice = sc.nextInt();

        double ageDiscount = 0;
        if (ageChoice == 1) {
            ageDiscount = 0.50;     // 50% off for children
        } else if (ageChoice == 2) {
            ageDiscount = 0.0;      // No discount
        } else if (ageChoice == 3) {
            ageDiscount = 0.30;     // 30% off for seniors
        } else {
            System.out.println("Invalid age group!");
            return;
        }

        // 3. Student Discount
        System.out.print("\nAre you a student? (yes/no): ");
        String student = sc.next().toLowerCase();

        double studentDiscount = 0;
        if (student.equals("yes")) {
            studentDiscount = 0.10; // 10% discount
        }

        // 4. Festival Discount
        System.out.print("Is there a festival offer? (yes/no): ");
        String festival = sc.next().toLowerCase();

        double festivalDiscount = 0;
        if (festival.equals("yes")) {
            festivalDiscount = 0.15; // 15% discount
        }

        // ----- PRICE CALCULATION -----
        double finalPrice = basePrice;

        // Apply age discount
        finalPrice -= (finalPrice * ageDiscount);

        // Apply student discount
        finalPrice -= (finalPrice * studentDiscount);

        // Apply festival discount
        finalPrice -= (finalPrice * festivalDiscount);

        System.out.println("\n----- FINAL TICKET PRICE -----");
        System.out.println("Base Price: NPR " + basePrice);
        System.out.println("Final Payable Amount: NPR " + finalPrice);
        System.out.println("-----------------------------------");
    }
}

