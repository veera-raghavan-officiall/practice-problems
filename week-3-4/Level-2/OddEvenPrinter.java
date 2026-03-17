import java.util.Scanner;

public class OddEvenPrinter {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
        
        // Get boundary number input
        System.out.print("Enter a natural number: ");
        int number = input.nextInt();
        
        // Validate natural number
        if (number > 0) {
            // Loop from 1 to the entered number
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is an even number");
                } else {
                    System.out.println(i + " is an odd number");
                }
            }
        } else {
            System.out.println("Please enter a positive integer.");
        }
        
        // Close the scanner
        input.close();
    }
}