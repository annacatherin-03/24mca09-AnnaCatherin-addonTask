package task;

import java.util.Scanner;

public class task19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the numbers separated by commas:");
        String input = scanner.nextLine();
        
        // Split the input string by commas and optional whitespace
        String[] numbers = input.split(",\\s*");
        
        double product = 1.0;
        
        for (String numStr : numbers) {
            double num = Double.parseDouble(numStr);
            product *= num;
        }
        
        System.out.println("Cumulative Product = " + product);
        scanner.close();
    }
}