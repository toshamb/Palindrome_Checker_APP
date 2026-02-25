import java.util.Deque;
import java.util.LinkedList;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String word = "racecar";
        Deque<Character> deque = new LinkedList<>();

        // Insert characters into deque
        for (int i = 0; i < word.length(); i++) {
            deque.addLast(word.charAt(i));
        }

        boolean isPalindrome = true;

        // Compare front and rear until deque is empty or mismatch found
        while (deque.size() > 1) {
            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("=======================================");
        System.out.println("   Palindrome Checker App - UC7");
        System.out.println("   Version: 1.0");
        System.out.println("=======================================");
        System.out.println("Checking word: " + word);

        if (isPalindrome) {
            System.out.println("Result: \"" + word + "\" is a palindrome.");
        } else {
            System.out.println("Result: \"" + word + "\" is not a palindrome.");
        }

        System.out.println("Program exiting...");
    }
}