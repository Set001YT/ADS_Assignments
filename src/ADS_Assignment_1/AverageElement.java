package ADS_Assignment_1;

import java.util.Scanner;

public class AverageElement {
    /**
     * This method calculates the average of an array.
     * It iterates through the array, sums all elements, and then divides by the number of elements.*
     * Time Complexity: O(n) - We iterate through the array once.
     * @param arr The array of elements.
     * @return The average of the elements.
     */
    public static double findAverage(int[] arr) {
        int sum = 0;
        for (int num : arr) { // Iterate through array
            sum += num; // Add each element to sum
        }
        return (double) sum / arr.length; // Calculate and return average
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
        double average = findAverage(arr);
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;

        System.out.println("Average: " + findAverage(arr)); // Print result
        System.out.println("Time taken: " + duration + " milliseconds");
    }
}
