package ADS_Assignment_1;

import java.util.Scanner;

public class GCD {
    /**
     * This method finds the greatest common divisor using recursion.
     * Time Complexity: O(log n) - Recursive division reduces input quickly.
     */
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();

        double startTime = System.nanoTime();
        int result = gcd(a, b);
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;

        System.out.println("The greatest common divisor of " + a + " and " + b + " is: " + result);
        System.out.println("\nTime taken: " + duration + " milliseconds");
    }
}
