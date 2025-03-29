package ADS_Assignment_1;

import java.util.Scanner;

public class Factorial {
    /**
     * This method calculates the factorial of a number recursively.
     * Time Complexity: O(n) - Recursive calls decrease by 1 each time.
     * @param n The number.
     * @return Factorial of n.
     */
    public static long factorial(int n) {
        if (n == 0 || n == 1) return 1; // Base case
        return n * factorial(n - 1); // Recursive call
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        double startTime = System.nanoTime();
        long factorial = factorial(n);
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;

        System.out.println(n + "! = " + factorial(n));
        System.out.println("Time taken: " + duration + " milliseconds");
    }
}
