/**
 * UC1: Palindrome Checker App - Entry Point
 * This class handles the initial startup and branding of the application.
 */
public class PalindromeCheckerApp {

    // Application Metadata
    public static final String APP_NAME = "Palindrome Checker App";
    public static final String APP_VERSION = "v1.0.0";

    /**
     * The main method is the entry point of the program.
     * The 'static' keyword allows the JVM to run this without instantiating the class.
     */
    public static void main(String[] args) {
        // Step 1: Display Welcome Message
        displayWelcomeMessage();

        // Step 2: Future logic (UC2) will go here
        System.out.println("\nReady to process palindromes...");

        // Final Exit message
        System.out.println("------------------------------------");
        System.out.println("Program execution complete.");
    }

    /**
     * Helper method to print application details to the console.
     */
    public static void displayWelcomeMessage() {
        System.out.println("====================================");
        System.out.println("    Welcome to " + APP_NAME);
        System.out.println("    Version: " + APP_VERSION);
        System.out.println("====================================");
    }
}