package task;
import java.util.Scanner;

public class task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Radius of Circle: ");
        double radius = scanner.nextDouble();
        double area = (22.0 / 7) * radius * radius;
        System.out.printf("Area of Circle with Radius %.4f is %.4f%n", radius, area);
        scanner.close();
    }
}