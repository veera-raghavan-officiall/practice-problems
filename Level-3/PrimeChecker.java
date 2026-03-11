import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
        
        // Get target number
        System.out.print("Enter a number (> 1): ");
        int number = input.nextInt();
        
        // Check prime numbers (must be > 1)
        if (number > 1) {
            boolean isPrime = true;
            
            // Loop from 2 to number-1 to find any divisors
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break; // Break the loop early if a divisor is found
                }
            }
            
            // Output final result
            if (isPrime) {
                System.out.println(number + " is a Prime Number");
            } else {
                System.out.println(number + " is not a Prime Number");
            }
        } else {
            System.out.println("Please enter a number greater than 1.");
        }
        
        // Close the scanner
        input.close();
    }
}