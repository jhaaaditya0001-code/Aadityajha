import java.util.Scanner;



public class sq1{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int repeat = 1;

        while (repeat == 1) {

            System.out.println("FD Calculator");

            System.out.print("Amount: ");
            double amt = sc.nextDouble();

            if (amt < 1000) {
                System.out.println("Min 1000 required");
                continue;
            }

            System.out.print("Years: ");
            int y = sc.nextInt();

            if (y > 5) {
                System.out.println("Max 5 years");
                continue;
            }

            System.out.print("Rate: ");
            double r = sc.nextDouble();

            // simple style interest
            double interest = (amt * r * y) / 100;

            // fee
            double fee = amt * 0.005;

            double total = amt + interest - fee;

            System.out.println("Total = " + total);

            System.out.print("Press 1 to do again, 0 to stop: ");
            repeat = sc.nextInt();
        }
    }
}

