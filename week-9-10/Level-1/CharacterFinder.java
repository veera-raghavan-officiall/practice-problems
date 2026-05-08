import java.util.Scanner;
import java.util.Arrays;

public class CharacterFinder {
    // Method to find all indexes of a character
    public static int[] findAllOccurrences(String text, char target) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == target) count++;
        }

        int[] indices = new int[count];
        int index = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == target) {
                indices[index++] = i;
            }
        }
        return indices;
    }

    public static void main(String[] args) {
        String sample = "programming is fun";
        char ch = 'g';

        int[] result = findAllOccurrences(sample, ch);
        System.out.println("Text: " + sample);
        System.out.println("Indices of '" + ch + "': " + Arrays.toString(result));
    }
}