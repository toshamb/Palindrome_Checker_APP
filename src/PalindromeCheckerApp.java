import java.util.Stack;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String word = "madam";
        Stack<Character> stack = new Stack<>();

        // Push characters into the stack
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        // Pop characters to build reversed string
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed = reversed + stack.pop();
        }

        System.out.println("=======================================");
        System.out.println("   Palindrome Checker App - UC5");
        System.out.println("   Version: 1.0");
        System.out.println("=======================================");
        System.out.println("Checking word: " + word);

        if (word.equals(reversed)) {
            System.out.println("Result: \"" + word + "\" is a palindrome.");
        } else {
            System.out.println("Result: \"" + word + "\" is not a palindrome.");
        }

        System.out.println("Program exiting...");
    }
}