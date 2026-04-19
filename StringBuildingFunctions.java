package String_Functions;
public class StringBuildingFunctions {

    public static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    public static int countOccurrences(String mainString, String subString) {
        if (mainString == null || subString == null || subString.isEmpty()) {
            return 0;
        }
        return (mainString.length() - mainString.replace(subString, "").length()) / subString.length();
    }

    public static String reverseString(String str) {
        if (str == null) {
            return null;
        }
        return new StringBuilder(str).reverse().toString();
    }

    public static boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return cleaned.equals(new StringBuilder(cleaned).reverse().toString());
    }

    public static String removeWhitespace(String str) {
        return str == null ? null : str.replaceAll("\\s", "");
    }

    public static String capitalizeWords(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        StringBuilder result = new StringBuilder();
        String[] words = str.split("\\s+");
        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)))
                      .append(word.substring(1).toLowerCase())
                      .append(" ");
            }
        }
        return result.toString().trim();
    }

    public static String truncate(String str, int maxLength) {
        if (str == null) {
            return null;
        }
        return str.length() > maxLength ? str.substring(0, maxLength) + "..." : str;
    }

    public static boolean isNumeric(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        return str.matches("\\d+");
    }

    public static String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder random = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * characters.length());
            random.append(characters.charAt(index));
        }
        return random.toString();
    }

    public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) {
            return 0;
        }
        return str.trim().split("\\s+").length;
    }

    public static void main(String[] args) {
        System.out.println("1. Is Empty: " + isNullOrEmpty(""));
        System.out.println("2. Occurrences: " + countOccurrences("hello hello world", "hello"));
        System.out.println("3. Reverse: " + reverseString("hello"));
        System.out.println("4. Palindrome: " + isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println("5. Remove Whitespace: " + removeWhitespace("Hello World"));
        System.out.println("6. Capitalize Words: " + capitalizeWords("hello world"));
        System.out.println("7. Truncate: " + truncate("Hello World", 5));
        System.out.println("8. Is Numeric: " + isNumeric("12345"));
        System.out.println("9. Random String: " + generateRandomString(10));
        System.out.println("10. Word Count: " + countWords("Hello world java"));
    }
}