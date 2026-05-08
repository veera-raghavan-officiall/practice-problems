import java.util.Scanner;

public class LeapYearChecker {
    // Method to check Leap Year conditions[cite: 2]
    public boolean isLeapYear(int year) {
        if (year < 1582) return false;
        // Divisible by 4 AND (not divisible by 100 OR divisible by 400)[cite: 2]
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LeapYearChecker checker = new LeapYearChecker();

        System.out.print("Enter year (>= 1582): ");
        int yearInput = input.nextInt();

        if (checker.isLeapYear(yearInput)) {
            System.out.println(yearInput + " is a Leap Year.");
        } else {
            System.out.println(yearInput + " is not a Leap Year.");
        }
    }
}