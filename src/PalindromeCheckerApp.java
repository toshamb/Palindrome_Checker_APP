public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String word = "madam";
        String reversed = new StringBuilder(word).reverse().toString();

        System.out.println("=======================================");
        System.out.println("   Palindrome Checker App - UC2");
        System.out.println("   Version: 1.0");
        System.out.println("=======================================");
        System.out.println("Checking hardcoded word: " + word);

        if (word.equals(reversed)) {
            System.out.println("Result: \"" + word + "\" is a palindrome.");
        } else {
            System.out.println("Result: \"" + word + "\" is not a palindrome.");
        }

        System.out.println("Program exiting...");
    }
}