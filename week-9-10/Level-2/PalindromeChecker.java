import java.util.Scanner;

public class PalindromeChecker {
    // Method to reverse a string manually
    public static String reverseString(String text) {
        String reversed = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }
        return reversed;
    }

    // Method to check if palindrome using logic
    public static boolean isPalindrome(String text) {
        String reversed = reverseString(text);
        return text.equalsIgnoreCase(reversed);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text to check palindrome: ");
        String input = sc.next();

        if (isPalindrome(input)) {
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is not a Palindrome.");
        }
    }
}