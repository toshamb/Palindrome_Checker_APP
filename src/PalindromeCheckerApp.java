public class PalindromeCheckerApp {

    public static String normalize(String input) {
        return input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    }

    public static boolean isPalindrome(String word) {
        int start = 0;
        int end = word.length() - 1;

        while (start < end) {
            if (word.charAt(start) != word.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        String word = "A man a plan a canal Panama";

        System.out.println("=======================================");
        System.out.println("   Palindrome Checker App - UC10");
        System.out.println("   Version: 1.0");
        System.out.println("=======================================");
        System.out.println("Checking word: " + word);

        String normalized = normalize(word);

        if (isPalindrome(normalized)) {
            System.out.println("Result: \"" + word + "\" is a palindrome (ignoring case and spaces).");
        } else {
            System.out.println("Result: \"" + word + "\" is not a palindrome.");
        }

        System.out.println("Program exiting...");
    }
}