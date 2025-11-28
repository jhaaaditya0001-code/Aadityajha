import java.util.Scanner;

public class GPAToGrade {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter GPA (0.0 – 4.0): ");

        double gpa = input.nextDouble();
        String grade;  // real variable

        // Validate GPA range
        if (gpa < 0.0 || gpa > 4.0) {
            System.out.println("Error: GPA must be between 0.0 and 4.0.");
        } else {

            // Print the code (your original output)
            System.out.println("String grade;");
            System.out.println();
            System.out.println("// Convert GPA to grade");
            System.out.println("if (gpa >= 3.6) {");
            System.out.println("    grade = \"A\";");
            System.out.println("} else if (gpa >= 3.2) {");
            System.out.println("    grade = \"B\";");
            System.out.println("} else if (gpa >= 2.0) {");
            System.out.println("    grade = \"C\";");
            System.out.println("} else if (gpa >= 1.0) {");
            System.out.println("    grade = \"D\";");
            System.out.println("} else {");
            System.out.println("    grade = \"F\";");
            System.out.println("}");

            // Actual working grade logic
            if (gpa >= 3.6) {
                grade = "A";
            } else if (gpa >= 3.2) {
                grade = "B";
            } else if (gpa >= 2.0) {
                grade = "C";
            } else if (gpa >= 1.0) {
                grade = "D";
            } else {
                grade = "F";
            }

            // Final output
            System.out.println("GPA: " + gpa + " → Grade: " + grade);
        }

        input.close();
    }
}

