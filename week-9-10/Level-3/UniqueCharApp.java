import java.util.Scanner;

/**
 * UniqueCharApp - Extracts unique characters from a string
 * @author Developer
 * @version 1.0
 */
public class UniqueCharApp {

    // Method to find the length of unique characters to initialize array
    public static int getUniqueCount(String text) {
        String unique = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (unique.indexOf(ch) == -1) {
                unique += ch;
            }
        }
        return unique.length();
    }

    // Method to return an array of unique characters
    public static char[] findUniqueCharacters(String text) {
        int size = getUniqueCount(text);
        char[] uniqueChars = new char[size];
        String unique = "";
        int index = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (unique.indexOf(ch) == -1) {
                unique += ch;
                uniqueChars[index++] = ch;
            }
        }
        return uniqueChars;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        char[] result = findUniqueCharacters(input);
        
        System.out.print("Unique characters found: ");
        for (char c : result) {
            System.out.print(c + " ");
        }
    }
}