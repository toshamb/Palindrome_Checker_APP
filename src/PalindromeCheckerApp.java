class PalindromeChecker {
    public boolean checkPalindrome(String word) {
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
}

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String word = "level";
        PalindromeChecker checker = new PalindromeChecker();

        System.out.println("=======================================");
        System.out.println("   Palindrome Checker App - UC11");
        System.out.println("   Version: 1.0");
        System.out.println("=======================================");
        System.out.println("Checking word: " + word);

        if (checker.checkPalindrome(word)) {
            System.out.println("Result: \"" + word + "\" is a palindrome.");
        } else {
            System.out.println("Result: \"" + word + "\" is not a palindrome.");
        }

        System.out.println("Program exiting...");
    }
}