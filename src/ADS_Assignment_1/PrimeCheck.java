package ADS_Assignment_1;

import java.util.Scanner;

public class PrimeCheck {
    /**
     * This method checks if a number is prime using recursion.
     * It divides n by numbers starting from 2 up to sqrt(n).
     * Time Complexity: O(√n) - We only check up to the square root of n.
     * @param n The number to check.
     * @param i The current divisor.
     * @return true if n is prime, false otherwise.
     */
    public static boolean isPrime(int n, int i) {
        if (n < 2) return false; // Base case: 0 and 1 are not prime
        if (i * i > n) return true; // Base case: checked all factors
        if (n % i == 0) return false; // If divisible, not prime
        return isPrime(n, i + 1); // Recursive call with next divisor
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        double startTime = System.nanoTime();
        boolean primecheck = isPrime(n,2);
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;

        System.out.println(n + (isPrime(n, 2) ? " is prime." : " is not prime."));
        System.out.println("Time taken: " + duration + " milliseconds");
    }
}
