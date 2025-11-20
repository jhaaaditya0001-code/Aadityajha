import java.util.Scanner;

public class GradeEvaluator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your grade:\t"); // \t = tab space
        int grade = input.nextInt();

        // Ternary Operator
        String result = (grade >= 40) ? "Pass" : "Fail";

        // Output with escape sequences
        System.out.println("\n-----------------------------");
        System.out.println("Grade:\t" + grade);
        System.out.println("Result:\t" + result);
        System.out.println("-----------------------------\n");
    }
}