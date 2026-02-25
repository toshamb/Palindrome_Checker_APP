public class PalindromeCheckerApp {

    // Recursive function to check palindrome
    public static boolean isPalindrome(String word, int start, int end) {
        // Base condition: if start >= end, it's a palindrome
        if (start >= end) {
            return true;
        }

        // If mismatch found, return false
        if (word.charAt(start) != word.charAt(end)) {
            return false;
        }

        // Recursive call: move inward
        return isPalindrome(word, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String word = "madam";

        System.out.println("=======================================");
        System.out.println("   Palindrome Checker App - UC9");
        System.out.println("   Version: 1.0");
        System.out.println("=======================================");
        System.out.println("Checking word: " + word);

        if (isPalindrome(word, 0, word.length() - 1)) {
            System.out.println("Result: \"" + word + "\" is a palindrome.");
        } else {
            System.out.println("Result: \"" + word + "\" is not a palindrome.");
        }

        System.out.println("Program exiting...");
    }
}