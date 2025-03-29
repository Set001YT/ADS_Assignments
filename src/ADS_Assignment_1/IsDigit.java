package ADS_Assignment_1;

import java.util.Scanner;

public class IsDigit {
    /**
     * This method checks if a string consists only of digits.
     * Time Complexity: O(n) - Each character is checked once.
     */
    public static boolean isAllDigits(String s, int index) {
        if (index == s.length()) return true;
        if (!Character.isDigit(s.charAt(index))) return false;
        return isAllDigits(s, index + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.next();

        double startTime = System.nanoTime();
        boolean result = isAllDigits(s, 0);
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;

        System.out.println("The result is: " + result); // Output: True or False
        System.out.println("\nTime taken: " + duration + " milliseconds");
    }
}
