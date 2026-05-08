import java.util.Scanner;

public class UppercaseConverter {
    // Method to convert lowercase to uppercase using ASCII logic
    public static String convertToUpperCaseCustom(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result += (char) (ch - 32);
            } else {
                result += ch;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter lowercase text: ");
        String userInput = input.nextLine();

        String customUpper = convertToUpperCaseCustom(userInput);
        String builtInUpper = userInput.toUpperCase();

        System.out.println("Custom Conversion: " + customUpper);
        System.out.println("Are results identical? " + customUpper.equals(builtInUpper));
    }
}