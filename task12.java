package task;
import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter 5 Numbers in the same line: ");
        int[] numbers = new int[5];

        // Read 5 numbers from user input
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Generate histogram
        System.out.println("\nHistogram Output:");
        for (int num : numbers) {
            System.out.print(num + " ");
            for (int i = 0; i < num; i++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Close scanner
        scanner.close();
    }
}