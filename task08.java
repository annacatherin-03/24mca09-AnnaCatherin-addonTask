package task;
import java.util.Scanner;

public class task08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter how many odd numbers to sum: ");
        int n = scanner.nextInt();

        // Calculate sum of first n odd numbers
        int sum = 0;
        for (int i = 1; i <= (2 * n - 1); i += 2) {
            sum += i;
        }

        // Display result
        System.out.printf("Sum of first %d odd numbers is %d%n", n, sum);

        // Close scanner
        scanner.close();
    }
}