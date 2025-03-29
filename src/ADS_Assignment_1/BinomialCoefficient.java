package ADS_Assignment_1;

import java.util.Scanner;

public class BinomialCoefficient {
    /**
     * This method calculates the binomial coefficient using recursion.
     * Time Complexity: O(2^n) - Exponential growth.
     */
    public static int binomialCoefficient(int n, int k) {
        if (k == 0 || k == n) return 1;
        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Enter k: ");
        int k = sc.nextInt();


        double startTime = System.nanoTime();
        int result = binomialCoefficient(n, k);
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;

        System.out.println("Binomial Coefficient: " + result);
        System.out.println("\nTime taken: " + duration + " milliseconds");
    }
}
