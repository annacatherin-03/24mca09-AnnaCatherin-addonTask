package task;
import java.util.Scanner;

public class task02{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

               System.out.print("Enter Principal Amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double rate = scanner.nextDouble();

        System.out.print("Enter No. of Years: ");
        double years = scanner.nextDouble();

              double simpleInterest = (principal * rate * years) / 100;

             System.out.printf("Simple Interest = %.2f%n", simpleInterest);

              scanner.close();
    }
}