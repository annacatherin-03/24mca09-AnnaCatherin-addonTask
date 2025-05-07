package task;

public class task10 {
    public static void main(String[] args) {
        long product = 1;

        // Loop through odd numbers from 1 to 15
        for (int i = 1; i <= 15; i += 2) {
            product *= i;
        }

        // Display result
        System.out.printf("Product of odd numbers from 1 to 15 = %d%n", product);
    }
}