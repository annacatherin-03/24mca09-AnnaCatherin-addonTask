package task;
import java.util.Scanner;

public class task04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        
        double celsius = (5 / 9.0) * (fahrenheit - 32);

        System.out.printf("%.6f deg F is %.6f deg C%n", fahrenheit, celsius);

        
        scanner.close();
    }
}