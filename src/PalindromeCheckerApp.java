interface PalindromeStrategy {
    boolean checkPalindrome(String word);
}

class StackStrategy implements PalindromeStrategy {
    public boolean checkPalindrome(String word) {
        java.util.Stack<Character> stack = new java.util.Stack<>();
        for (char c : word.toCharArray()) {
            stack.push(c);
        }
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }
        return word.equals(reversed);
    }
}

class DequeStrategy implements PalindromeStrategy {
    public boolean checkPalindrome(String word) {
        java.util.Deque<Character> deque = new java.util.LinkedList<>();
        for (char c : word.toCharArray()) {
            deque.addLast(c);
        }
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }
}

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String word = "racecar";

        PalindromeStrategy strategy;

        strategy = new StackStrategy();
        System.out.println("=======================================");
        System.out.println("   Palindrome Checker App - UC12");
        System.out.println("   Version: 1.0");
        System.out.println("=======================================");
        System.out.println("Checking word with StackStrategy: " + word);
        System.out.println(strategy.checkPalindrome(word) ? "Palindrome" : "Not Palindrome");

        strategy = new DequeStrategy();
        System.out.println("Checking word with DequeStrategy: " + word);
        System.out.println(strategy.checkPalindrome(word) ? "Palindrome" : "Not Palindrome");

        System.out.println("Program exiting...");
    }
}