import java.util.Scanner;

/**
 * CharFrequencyApp - Calculates occurrences of each character
 * @author Developer
 * @version 1.0
 */
public class CharFrequencyApp {

    // Method to find frequency of characters and return a 2D String array
    public static String[][] findFrequency(String text) {
        String unique = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (unique.indexOf(ch) == -1) {
                unique += ch;
            }
        }

        String[][] frequencyMap = new String[unique.length()][2];

        for (int i = 0; i < unique.length(); i++) {
            char target = unique.charAt(i);
            int count = 0;
            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == target) {
                    count++;
                }
            }
            frequencyMap[i][0] = String.valueOf(target);
            frequencyMap[i][1] = String.valueOf(count);
        }
        return frequencyMap;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text to analyze frequency: ");
        String input = sc.nextLine();

        String[][] result = findFrequency(input);

        System.out.println("\nCharacter | Frequency");
        System.out.println("---------------------");
        for (String[] row : result) {
            System.out.println("    " + row[0] + "     |    " + row[1]);
        }
    }
}