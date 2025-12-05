import java.util.Scanner;


public class sq2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int repeat = 1;

        while (repeat == 1) {

            double P, annualRate, monthlyRate, years, months, A, feeRate, fee, finalAmount;

            System.out.print("Amount: ");
            P = sc.nextDouble();

            System.out.print("Years: ");
            years = sc.nextDouble();

            System.out.print("Rate: ");
            annualRate = sc.nextDouble();

            monthlyRate = annualRate / 12 / 100;
            months = years * 12;

            A = P;

            int i = 1;
            while (i <= months) {
                A = A + (A * monthlyRate);
                i++;
            }

            feeRate = 0.005;
            fee = P * feeRate;

            finalAmount = A - fee;

            System.out.println("Final Amount = " + finalAmount);

            System.out.print("1 = again, 0 = stop: ");
            repeat = sc.nextInt();
        }
    }
}

