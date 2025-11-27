import java.util.Scanner;

public class SellingPriceCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float mp, sp, discount = 0f;
        char category;

        System.out.print("Enter marked price: ");
        mp = sc.nextFloat();

        System.out.print("Enter category (A/B/C/D): ");
        category = sc.next().charAt(0);

        if (category == 'A' || category == 'a') {
            discount = 0.60f;
        } 
        else if (category == 'B' || category == 'b') {
            discount = 0.40f;
        } 
        else if (category == 'C' || category == 'c') {
            discount = 0.20f;
        } 
        else if (category == 'D' || category == 'd') {
            discount = 0.10f;
        } 
        else {
            System.out.println("Invalid category!");
            return;
        }

        sp = mp - (mp * discount);

        System.out.println("Selling Price = " + sp);
    }
}

