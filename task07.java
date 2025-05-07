package task;
import java.util.Scanner;

public class task07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Five-letter word: ");
        String word = scanner.nextLine();
        if (word.length() != 5) {
            System.out.println("Error: Please enter a five-letter word.");
        } else {
            StringBuilder encodedWord = new StringBuilder();
            for (char ch : word.toCharArray()) {
                encodedWord.append((char) (ch - 1));
            }
            System.out.println("Encoded Word: " + encodedWord.toString());
        }
        scanner.close();
    }
}