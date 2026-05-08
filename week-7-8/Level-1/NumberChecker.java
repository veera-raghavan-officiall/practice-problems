import java.util.Scanner;

public class NumberChecker {
    // Method returns -1 for negative, 1 for positive, and 0 for zero[cite: 1]
    public int checkNumberStatus(int number) {
        if (number > 0) {
            return 1;
        } else if (number < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        NumberChecker checker = new NumberChecker();

        System.out.print("Enter an integer: ");
        int userInput = input.nextInt();

        int status = checker.checkNumberStatus(userInput);
        System.out.println("Number status (1:Pos, -1:Neg, 0:Zero): " + status);
    }
}