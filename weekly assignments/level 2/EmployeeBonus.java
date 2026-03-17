import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter salary: ");
        double salary = scanner.nextDouble();
        
        System.out.print("Enter years of service: ");
        int yearsOfService = scanner.nextInt();
        
        double bonus = 0.0;
        if (yearsOfService > 5) {
            bonus = salary * 0.05;
            System.out.println("You received a bonus of 5%!");
        } else {
            System.out.println("No bonus. Years of service must be more than 5 years.");
        }
        
        System.out.println("Bonus amount: " + bonus);
        
        scanner.close();
    }
}
