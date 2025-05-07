package task;

import java.util.Scanner;

public class task20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("How many Fibonacci terms?");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }
        
        int[] fib = new int[n];
        fib[0] = 1;
        if (n > 1) {
            fib[1] = 1;
        }
        
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
        
        System.out.print("Fibonacci Sequence: ");
        for (int num : fib) {
            System.out.print(num + " ");
        }
        
        scanner.close();
    }
}