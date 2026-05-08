import java.util.Arrays;

public class WordAnalyzer {
    // Method to find words and their lengths
    public static String[][] getWordsAndLengths(String text) {
        // Simple manual split logic based on spaces
        String[] words = text.trim().split("\\s+");
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(words[i].length());
        }
        return result;
    }

    public static void main(String[] args) {
        String sentence = "Java Programming is exciting";
        String[][] analysis = getWordsAndLengths(sentence);

        System.out.println("Word\t\tLength");
        for (String[] row : analysis) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
    }
}