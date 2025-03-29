package ADS_Assignment_1;

import java.util.Scanner;

public class ReversePrint {
    /**
     * This method prints the array in reverse order using recursion.*
     * Time Complexity: O(n) - Each element is printed once.
     * @param arr The input array.
     * @param index Current index.
     */
    public static void printReverse(int[] arr, int index) {
        if (index < 0) return;
        System.out.print(arr[index] + " ");
        printReverse(arr, index - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        double startTime = System.nanoTime();
        System.out.println("\nThe array in reverse order is: ");
        printReverse(arr, n - 1);
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;

        System.out.println("\nTime taken: " + duration + " milliseconds");;
    }
}
