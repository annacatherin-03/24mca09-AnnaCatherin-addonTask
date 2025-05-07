package task;
import java.util.Scanner;

public class task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter Principal Value: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double rate = scanner.nextDouble();

        System.out.print("Enter No. of Years: ");
        int years = scanner.nextInt();

      
        double interestRate = rate / 100;
        double finalAmount = principal * Math.pow((1 + interestRate), years);

    
        System.out.printf("Compound Interest = %.2f%n", finalAmount);


        scanner.close();
    }
}