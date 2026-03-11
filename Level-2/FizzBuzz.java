import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
        
        // Get target number
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();
        
        // Validate positive integer
        if (number > 0) {
            // Loop through numbers to apply FizzBuzz logic
            for (int i = 1; i <= number; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Input must be a positive integer.");
        }
        
        // Close the scanner
        input.close();
    }
}