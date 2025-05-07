package task;
import java.util.Scanner;

public class task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the N value: ");
        int n = scanner.nextInt();

        // Print table header
        System.out.println("N   |   Factorial");
        System.out.println("--------------------");

        // Calculate and print factorials
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
            System.out.printf("%-3d | %12d%n", i, factorial);
        }

        // Close scanner
        scanner.close();
    }
}