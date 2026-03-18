/**
 * DigitFrequency.java - Counts the occurrence of each digit in a number.
 * @author Veera Raghavan
 */
import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = Math.abs(input.nextLong()); // Handle negative input
        
        int[] frequency = new int[10]; // Indices 0-9 represent digits

        // Extract digits and increment frequency
        long temp = number;
        if (temp == 0) frequency[0] = 1;
        
        while (temp > 0) {
            int digit = (int)(temp % 10);
            frequency[digit]++;
            temp /= 10;
        }

        System.out.println("Digit frequencies for " + number + ":");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " appears " + frequency[i] + " times.");
            }
        }
        input.close();
    }
}