import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        double first = scanner.nextDouble();
        
        System.out.print("Enter operator (+, -, *, /): ");
        String op = scanner.next();
        
        System.out.print("Enter second number: ");
        double second = scanner.nextDouble();

        switch (op) {
            case "+":
                System.out.println(first + " + " + second + " = " + (first + second));
                break;
            case "-":
                System.out.println(first + " - " + second + " = " + (first - second));
                break;
            case "*":
                System.out.println(first + " * " + second + " = " + (first * second));
                break;
            case "/":
                if (second != 0) {
                    System.out.println(first + " / " + second + " = " + (first / second));
                } else {
                    System.out.println("Division by zero error.");
                }
                break;
            default:
                System.out.println("Invalid Operator");
        }

        scanner.close();
    }
}
