public class PalindromeCheckerApp {

    public static boolean isPalindromeSimple(String word) {
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

    public static boolean isPalindromeStack(String word) {
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

    public static boolean isPalindromeDeque(String word) {
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

    public static void main(String[] args) {
        String word = "racecar";

        System.out.println("=======================================");
        System.out.println("   Palindrome Checker App - UC13");
        System.out.println("   Version: 1.0");
        System.out.println("=======================================");
        System.out.println("Checking word: " + word);

        long startTime, endTime;

        startTime = System.nanoTime();
        boolean resultSimple = isPalindromeSimple(word);
        endTime = System.nanoTime();
        System.out.println("Simple Approach: " + (resultSimple ? "Palindrome" : "Not Palindrome") +
                " | Time: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        boolean resultStack = isPalindromeStack(word);
        endTime = System.nanoTime();
        System.out.println("Stack Approach: " + (resultStack ? "Palindrome" : "Not Palindrome") +
                " | Time: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        boolean resultDeque = isPalindromeDeque(word);
        endTime = System.nanoTime();
        System.out.println("Deque Approach: " + (resultDeque ? "Palindrome" : "Not Palindrome") +
                " | Time: " + (endTime - startTime) + " ns");

        System.out.println("Program exiting...");
    }
}