package ADS_Assignment_1;

import java.util.Scanner;

public class Fibonacci {
    /**
     * This method finds the nth Fibonacci number recursively.
     * Time Complexity: O(2^n) - Exponential due to redundant calculations.
     * @param n The Fibonacci index.
     * @return Fibonacci number.
     */
    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive calls
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();

        double startTime = System.nanoTime();
        int fibonacci = fibonacci(n);
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;

        System.out.println("Fibonacci(" + n + ") = " + fibonacci(n));
        System.out.println("Time taken: " + duration + " milliseconds");
    }
}
