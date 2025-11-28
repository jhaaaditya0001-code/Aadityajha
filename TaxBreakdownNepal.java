import java.util.*;

public class TaxBreakdownNepal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your annual income (NPR): ");
        double income = sc.nextDouble();

        double tax = 0;

        System.out.println("\n===== TAX BREAKDOWN =====");

        // Bracket 1: Up to 5,00,000 (1%)
        double bracket1 = Math.min(income, 500000);
        double tax1 = bracket1 * 0.01;
        tax += tax1;
        System.out.println("1) Up to 5,00,000 @1%: " + (int)bracket1 + " × 1% = " + (int)tax1);

        // Bracket 2: 5,00,001 to 7,00,000 (10%)
        if (income > 500000) {
            double bracket2 = Math.min(income - 500000, 200000);
            double tax2 = bracket2 * 0.10;
            tax += tax2;
            System.out.println("2) Next 2,00,000 @10%: " + (int)bracket2 + " × 10% = " + (int)tax2);
        }

        // Bracket 3: 7,00,001 to 10,00,000 (20%)
        if (income > 700000) {
            double bracket3 = Math.min(income - 700000, 300000);
            double tax3 = bracket3 * 0.20;
            tax += tax3;
            System.out.println("3) Next 3,00,000 @20%: " + (int)bracket3 + " × 20% = " + (int)tax3);
        }

        // Bracket 4: 10,00,001 to 20,00,000 (30%)
        if (income > 1000000) {
            double bracket4 = Math.min(income - 1000000, 1000000);
            double tax4 = bracket4 * 0.30;
            tax += tax4;
            System.out.println("4) Next 10,00,000 @30%: " + (int)bracket4 + " × 30% = " + (int)tax4);
        }

        // Bracket 5: 20,00,001 to 50,00,000 (36%)
        if (income > 2000000) {
            double bracket5 = Math.min(income - 2000000, 3000000);
            double tax5 = bracket5 * 0.36;
            tax += tax5;
            System.out.println("5) Next 30,00,000 @36%: " + (int)bracket5 + " × 36% = " + (int)tax5);
        }

        // Bracket 6: Above 50,00,000 (39%)
        if (income > 5000000) {
            double bracket6 = income - 5000000;
            double tax6 = bracket6 * 0.39;
            tax += tax6;
            System.out.println("6) Remaining @39%: " + (int)bracket6 + " × 39% = " + (int)tax6);
        }

        // Print total tax
        System.out.println("\nTotal Tax Payable = NPR " + (int)tax);
        System.out.println("===========================");
    }
}
