package ADS_Assignment_1;

import java.util.Scanner;

public class MinElement {
    /**
     * This method finds the minimum element in an array.
     * It iterates through the array once and keeps track of the smallest value.
     * Time Complexity: O(n) - We traverse the array once.
     * @param arr The array of elements.
     * @return The minimum element.
     */
    public static int findMin(int[] arr) {
        int min = arr[0]; // Assume first element is the minimum
        for (int num : arr) { // Iterate through array
            if (num < min) {
                min = num; // Update min if a smaller value is found
            }
        }
        return min; // Return the minimum element
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // Read input elements
        }
        double startTime = System.nanoTime();
        int min = findMin(arr);
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;

        System.out.println("Minimum element: " + findMin(arr)); // Print result
        System.out.println("Time taken: " + duration + " milliseconds");
    }
}
