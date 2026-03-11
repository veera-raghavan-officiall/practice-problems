import java.util.Scanner;

public class FactorsFinder {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
        
        // Get number input
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();
        
        // Validate and find factors
        if (number > 0) {
            System.out.println("Factors of " + number + " are:");
            
            // Loop up to the number itself to find perfect divisors
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        }
        
        // Close the scanner
        input.close();
    }
}