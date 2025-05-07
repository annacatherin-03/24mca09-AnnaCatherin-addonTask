package task;
import java.util.Scanner;

public class task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the text below: ");
        String input = scanner.nextLine();

        // Initialize counters
        int letters = 0, digits = 0, spaces = 0, others = 0;

        // Loop through characters and classify them
        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                letters++;
            } else if (Character.isDigit(ch)) {
                digits++;
            } else if (Character.isWhitespace(ch)) {
                spaces++;
            } else {
                others++;
            }
        }

        // Display results
        System.out.println("\nAnalysis:");
        System.out.println("Letters    : " + letters);
        System.out.println("Digits     : " + digits);
        System.out.println("Space Chars: " + spaces);
        System.out.println("Others     : " + others);

        // Close scanner
        scanner.close();
    }
}