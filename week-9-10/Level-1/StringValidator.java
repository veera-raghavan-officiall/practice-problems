public class StringValidator {
    // Method to check if string is null or empty
    public static boolean isStringEmpty(String text) {
        if (text == null || text.length() == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String test1 = null;
        String test2 = "";
        String test3 = "Hello";

        System.out.println("Test 1 (null) Empty? " + isStringEmpty(test1));
        System.out.println("Test 2 (\"\") Empty? " + isStringEmpty(test2));
        System.out.println("Test 3 (\"Hello\") Empty? " + isStringEmpty(test3));
    }
}