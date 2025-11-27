import java.util.Scanner;

public class DivisibleBy3And5Nested {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // First check divisibility by 3
        if (number % 3 == 0) {
            // Then check divisibility by 5
            if (number % 5 == 0) {
                System.out.println(number + " is divisible by both 3 and 5.");
            } else {
                System.out.println(number + " is divisible by 3 but not by 5.");
            }
        } else {
            System.out.println(number + " is not divisible by 3, so it cannot be divisible by both 3 and 5.");
        }

        sc.close();
    }
}
