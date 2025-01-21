import java.util.Scanner;

public class ArithmaticOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number: ");
        int a = sc.nextInt();
        System.out.println("enter second nuber: ");
        int b = sc.nextInt();

        int add = a + b;
        int subtract = a - b;
        int divide = a / b;
        int multiply = a * b;
        int mod = a % b;

        System.out.println("Addition of " + a + " & " + b + " = " + add);
        System.out.println("subtraction of " + a + " & " + b + " = " + subtract);
        System.out.println("Division of " + a + " & " + b + " = " + divide);
        System.out.println("Modulus of " + a + " & " + b + " = " + mod);
        System.out.println("Multiplication of " + a + " & " + b + " = " + multiply);

        System.out.println("********************************");
        System.out.println("Increment and decrement");
        int c = a++;
        int d = ++a;
        System.out.println("Before Post-Increment: " + a + "\nafter post increment :" + c);
        System.out.println("Before Pre-Increment: " + a + "\nafter pre-increment :" + d);
        sc.close();
    }
}
