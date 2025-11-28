import java.util.*;

public class IncomeTaxNepal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your annual income (NPR): ");
        double income = sc.nextDouble();

        double tax = 0;

        if (income <= 500000) {
            tax = income * 0.01; // 1%
        }
        else if (income <= 700000) {
            tax = 5000 + (income - 500000) * 0.10; // 10%
        }
        else if (income <= 1000000) {
            tax = 15000 + (income - 700000) * 0.20; // 20%
        }
        else if (income <= 2000000) {
            tax = 35000 + (income - 1000000) * 0.30; // 30%
        }
        else if (income <= 5000000) {
            tax = 335000 + (income - 2000000) * 0.36; // 36%
        }
        else {
            tax = 1135000 + (income - 5000000) * 0.39; // 39%
        }

        System.out.println("======================================");
        System.out.println("Annual Income: NPR " + income);
        System.out.println("Total Tax Payable: NPR " + tax);
        System.out.println("======================================");
    }
}
