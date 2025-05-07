package task;
import java.util.Scanner;

public class task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter how many numbers you want to input: ");
        int n = scanner.nextInt();

        // Validate input
        if (n <= 0) {
            System.out.println("Error: Please enter a positive number.");
            scanner.close();
            return;
        }

        // Read first number as the smallest
        System.out.print("Enter number 1: ");
        int smallest = scanner.nextInt();

        // Loop for remaining numbers
        for (int i = 2; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = scanner.nextInt();
            if (num < smallest) {
                smallest = num;
            }
        }

        // Display result
        System.out.println("The smallest number is: " + smallest);

        // Close scanner
        scanner.close();
    }
}