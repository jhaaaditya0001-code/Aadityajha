import java.util.Scanner;

public class SellingPriceSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float mp, sp, discount = 0f;
        char category;

        System.out.print("Enter marked price: ");
        mp = sc.nextFloat();

        System.out.print("Enter category (A/B/C/D): ");
        category = sc.next().charAt(0);

        switch (Character.toUpperCase(category)) {
            case 'A':
                discount = 0.60f;
                break;

            case 'B':
                discount = 0.40f;
                break;

            case 'C':
                discount = 0.20f;
                break;

            case 'D':
                discount = 0.10f;
                break;

            default:
                System.out.println("Invalid category!");
                return;
        }

        sp = mp - (mp * discount);

        System.out.println("Selling Price = " + sp);
    }
}
