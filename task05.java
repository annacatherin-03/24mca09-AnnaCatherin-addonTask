package task;
import java.util.Scanner;

public class task05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        System.out.print("Enter Radius of Sphere: ");
        double radius = scanner.nextDouble();

               double area = 4 * Math.PI * Math.pow(radius, 2);

                double volume = (4.0 / 3) * Math.PI * Math.pow(radius, 3);

       
        System.out.printf("Volume of Sphere: %.6f%n", volume);
        System.out.printf("Area of Sphere  : %.6f%n", area);

        
        scanner.close();
    }
}