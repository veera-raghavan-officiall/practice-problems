import java.util.Scanner;

public class NaturalNumberSum {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
        
        // Get number input
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        // Check if it is a natural number (> 0)
        if (number > 0) {
            // Compute the sum using the formula n*(n+1)/2
            int sum = number * (number + 1) / 2;
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + number + " is not a natural number");
        }
        
        // Close the scanner
        input.close();
    }
}