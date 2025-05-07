package task;

public class task09 {
    public static void main(String[] args) {
        int sum = 0;

        // Loop through even numbers from 2 to 30
        for (int i = 2; i <= 30; i += 2) {
            sum += i;
        }

        // Display result
        System.out.printf("Sum of even numbers from 2 to 30 = %d%n", sum);
    }
}