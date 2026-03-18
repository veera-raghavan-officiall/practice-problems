/**
 * MultiplicationTable.java - Generates and stores a multiplication table.
 * * @author Veera Raghavan
 */
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int[] table = new int[10];

        // Store results in array
        for (int i = 0; i < 10; i++) {
            table[i] = number * (i + 1);
        }

        // Display results from array
        System.out.println("Multiplication Table for " + number + ":");
        for (int i = 0; i < 10; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + table[i]);
        }
        input.close();
    }
}