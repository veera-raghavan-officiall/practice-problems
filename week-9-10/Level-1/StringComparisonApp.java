public class StringComparisonApp {
    // Method to create a string from character array using a loop
    public static String buildStringManually(char[] characters) {
        String result = "";
        for (char c : characters) {
            result += c;
        }
        return result;
    }

    // Method to compare two strings character by character
    public static boolean areStringsEqual(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        char[] charArray = {'J', 'a', 'v', 'a'};
        
        String manualString = buildStringManually(charArray);
        String builtInString = new String(charArray);

        boolean comparison = areStringsEqual(manualString, builtInString);
        System.out.println("Manual String: " + manualString);
        System.out.println("Built-in String: " + builtInString);
        System.out.println("Are they equal? " + comparison);
    }
}