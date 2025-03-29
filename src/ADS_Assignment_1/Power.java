package ADS_Assignment_1;

import java.util.Scanner;

public class Power {
    /**
     * This method calculates a^n using recursion.
     * Time Complexity: O(n) - Linear recursive calls.
     * @param a Base number.
     * @param n Exponent.
     * @return a^n.
     */
    public static int power(int a, int n) {
        if (n == 0) return 1;
        return a * power(a, n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();

        System.out.println("Enter n: ");
        int n = sc.nextInt();

        double startTime = System.nanoTime();
        int power = power(a, n);
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;

        System.out.println(a + "^" + n + " = " + power(a, n));
        System.out.println("Time taken: " + duration + " milliseconds");
    }
}
