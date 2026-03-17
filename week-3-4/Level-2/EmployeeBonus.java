import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
        
        // Get salary and years of service
        System.out.print("Enter employee salary: ");
        double salary = input.nextDouble();
        
        System.out.print("Enter years of service: ");
        int yearsOfService = input.nextInt();
        
        // Check if years of service is greater than 5
        if (yearsOfService > 5) {
            double bonus = salary * 0.05;
            System.out.println("The bonus amount is INR " + bonus);
        } else {
            System.out.println("The bonus amount is INR 0.0");
        }
        
        // Close the scanner
        input.close();
    }
}