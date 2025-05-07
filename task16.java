package task;
import java.util.Scanner;

public class task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter Color code character: ");
        char colour = scanner.next().charAt(0);

        // Determine color using switch statement
        String colorName;
        switch (Character.toLowerCase(colour)) {
            case 'r':
                colorName = "RED";
                break;
            case 'g':
                colorName = "GREEN";
                break;
            case 'b':
                colorName = "BLUE";
                break;
            default:
                colorName = "BLACK";
        }

        // Display result
        System.out.printf("Color Code %c is %s%n", colour, colorName);

        // Close scanner
        scanner.close();
    }
}