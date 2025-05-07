package task;
import java.util.Scanner;

public class task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter Heat code (1-3): ");
        int flag = scanner.nextInt();

        // Determine heat status using switch statement
        String heatStatus;
        switch (flag) {
            case 1:
                heatStatus = "HOT";
                break;
            case 2:
                heatStatus = "LUKE WARM";
                break;
            case 3:
                heatStatus = "COLD";
                break;
            default:
                heatStatus = "OUT OF RANGE";
        }

        // Display result
        System.out.printf("Flag %d is %s%n", flag, heatStatus);

        // Close scanner
        scanner.close();
    }
}