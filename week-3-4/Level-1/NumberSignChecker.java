import java.util.Scanner;

public class NumberSignChecker {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
        
        // Get number input
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        // Check if positive, negative, or zero using if/else if/else
        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
        
        // Close the scanner
        input.close();
    }
}