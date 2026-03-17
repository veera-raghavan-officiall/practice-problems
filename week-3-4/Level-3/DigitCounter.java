import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
        
        // Get integer input
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        
        int originalNumber = number;
        int count = 0;
        
        // Handle negative numbers to count their digits properly
        if (number < 0) {
            number = number * -1;
        }
        
        // Special case for zero
        if (number == 0) {
            count = 1;
        } else {
            // Count digits by repeatedly dividing by 10
            while (number != 0) {
                number = number / 10;
                count++;
            }
        }
        
        // Display result
        System.out.println("The number of digits in " + originalNumber + " is " + count);
        
        // Close the scanner
        input.close();
    }
}