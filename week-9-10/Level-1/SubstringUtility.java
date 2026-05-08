import java.util.Scanner;

public class SubstringUtility {
    // Custom method to extract substring using charAt()
    public static String getCustomSubstring(String text, int start, int end) {
        String sub = "";
        for (int i = start; i < end; i++) {
            sub += text.charAt(i);
        }
        return sub;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String original = sc.nextLine();
        
        int start = 1, end = 4;
        
        String custom = getCustomSubstring(original, start, end);
        String builtIn = original.substring(start, end);

        System.out.println("Custom Substring: " + custom);
        System.out.println("Built-in Substring: " + builtIn);
        System.out.println("Logic match: " + custom.equals(builtIn));
    }
}