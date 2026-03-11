import java.util.Scanner;

public class DivisibleByFive {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
        
        // Get integer input
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        // Check if the number is perfectly divisible by 5
        if (number % 5 == 0) {
            System.out.println("Is the number " + number + " divisible by 5? Yes");
        } else {
            System.out.println("Is the number " + number + " divisible by 5? No");
        }
        
        // Close the scanner
        input.close();
    }
}