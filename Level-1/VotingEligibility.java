/**
 * VotingEligibility.java - Checks voting eligibility for a class of 10 students.
 * * @author Veera Raghavan
 * @version 1.0
 */
import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] studentAges = new int[10];

        // Input loop for 10 students
        for (int i = 0; i < studentAges.length; i++) {
            System.out.print("Enter age for student " + (i + 1) + ": ");
            studentAges[i] = input.nextInt();
        }

        System.out.println("\n--- Eligibility Results ---");
        // Validation and Eligibility loop
        for (int age : studentAges) {
            if (age < 0) {
                System.out.println("Invalid age: " + age);
            } else if (age >= 18) {
                System.out.println("The student with age " + age + " can vote.");
            } else {
                System.out.println("The student with age " + age + " cannot vote.");
            }
        }
        input.close();
    }
}