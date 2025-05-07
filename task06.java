package task;
import java.util.Scanner;

public class task06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Mark 1: ");
        int mark1 = scanner.nextInt();

        System.out.print("Enter Mark 2: ");
        int mark2 = scanner.nextInt();

        System.out.print("Enter Mark 3: ");
        int mark3 = scanner.nextInt();
        int totalMarks = mark1 + mark2 + mark3;
        double averageMarks = totalMarks / 3.0;
        System.out.printf("Total Marks   = %d%n", totalMarks);
        System.out.printf("Average Marks = %.1f%n", averageMarks);
        scanner.close();
    }
}