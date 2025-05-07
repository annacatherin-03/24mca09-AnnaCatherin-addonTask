package task;
import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the water temperature: ");
        double temp = scanner.nextDouble();

        // Determine the state of water
        String state;
        if (temp < 0) {
            state = "ICE";
        } else if (temp <= 100) {
            state = "WATER";
        } else {
            state = "STEAM";
        }

        // Display result
        System.out.printf("Water status is %s for the Temperature %.2f%n", state, temp);

        // Close scanner
        scanner.close();
    }
}