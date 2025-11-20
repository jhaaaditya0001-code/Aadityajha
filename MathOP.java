public class MathOP {

    public static void main(String[] args) {

        // 1. Arithmetic Operators
        int a = 10, b = 3;
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // 2. Unary Operators (pre-increment and post-increment)
        int x = 5;
        System.out.println("\nUnary Operators:");
        System.out.println("x = " + x);
        System.out.println("x++ (post-increment) = " + (x++)); 
        System.out.println("Now x = " + x);
        System.out.println("++x (pre-increment) = " + (++x)); 
        System.out.println("Now x = " + x);

        // 3. Assignment Operators
        int y = 10;
        System.out.println("\nAssignment Operators:");
        y += 5;  
        System.out.println("y += 5 → " + y);
        y -= 3;  
        System.out.println("y -= 3 → " + y);
        y *= 2;  
        System.out.println("y *= 2 → " + y);
        y /= 4;  
        System.out.println("y /= 4 → " + y);

        // 4. Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a > b = " + (a > b));
        System.out.println("a < b = " + (a < b));
        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));

        // 5. Logical Operators
        boolean p = true, q = false;
        System.out.println("\nLogical Operators:");
        System.out.println("p && q = " + (p && q));
        System.out.println("p || q = " + (p || q));
        System.out.println("!p = " + (!p));

        // 6. Ternary Operator
        int age = 18;
        String result = (age >= 18) ? "Adult" : "Minor";
        System.out.println("\nTernary Operator:");
        System.out.println("Age: " + age + " → " + result);
    }
}