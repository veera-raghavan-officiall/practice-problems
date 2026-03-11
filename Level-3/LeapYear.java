import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
        
        // Get year input
        System.out.print("Enter a year (>= 1582): ");
        int year = input.nextInt();
        
        // Validate Gregorian calendar boundary
        if (year >= 1582) {
            // Check logic: divisible by 4 AND NOT 100, OR divisible by 400
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a Leap Year");
            } else {
                System.out.println(year + " is not a Leap Year");
            }
        } else {
            System.out.println("Year must be >= 1582");
        }
        
        // Close the scanner
        input.close();
    }
}