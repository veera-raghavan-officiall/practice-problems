/**
 * DigitFrequency.java - A program to find the frequency of each digit in a number.
 * This fulfills the Level 3 Practice Requirement.
 *
 * @author Veera Raghavan
 * @version 1.0
 */
import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Take the input for a number
        System.out.print("Enter a number: ");
        long number = input.nextLong();
        
        // Use absolute value to handle negative inputs correctly
        long tempNumber = Math.abs(number);

        // 1. Find the count of digits in the number
        int count = 0;
        long temp = tempNumber;
        if (temp == 0) count = 1; // Handle the case for the number 0
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        // 2. Find the digits in the number and save them in an array
        int[] digits = new int[count];
        temp = tempNumber;
        for (int i = 0; i < count; i++) {
            digits[i] = (int)(temp % 10);
            temp /= 10;
        }

        // 3. Find the frequency of each digit using a frequency array of size 10
        int[] frequency = new int[10]; 
        for (int i = 0; i < digits.length; i++) {
            int digitValue = digits[i];
            frequency[digitValue]++;
        }

        // 4. Display the frequency of each digit in the number
        System.out.println("\nDigit Frequency Report for: " + number);
        System.out.println("------------------------------------");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " times.");
            }
        }

        // Close the Scanner Object
        input.close();
    }
}