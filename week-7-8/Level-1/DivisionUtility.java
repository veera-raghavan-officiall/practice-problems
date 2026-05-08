import java.util.Scanner;

public class DivisionUtility {
    // Method returns an array containing remainder at index 0 and quotient at index 1[cite: 1]
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        int[] results = {remainder, quotient};
        return results;
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int numberValue = console.nextInt();
        System.out.print("Enter Divisor: ");
        int divisorValue = console.nextInt();

        int[] outcome = findRemainderAndQuotient(numberValue, divisorValue);

        System.out.println("For number " + numberValue + " and divisor " + divisorValue + ":");
        System.out.println("Quotient: " + outcome[1]);
        System.out.println("Remainder: " + outcome[0]);
    }
}