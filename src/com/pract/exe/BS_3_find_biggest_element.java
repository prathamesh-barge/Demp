package com.pract.exe;

public class BS_3_find_biggest_element {
    // A function to find the max element in a sorted array using binary search
    public static int findMax(int[] arr) {
        // Check if the array is null or empty
        if (arr == null || arr.length == 0) {
            return -1; // Invalid input
        }
        // Check if the array has only one element
        if (arr.length == 1) {
            return arr[0]; // The only element is the max
        }
        // Initialize start and end pointers
        int start = 0;

        int end = arr.length - 1;

        // Loop until start and end pointers meet
        while (start <= end) {
            // Find the middle index
            int mid = start + (end - start) / 2;
            // Check if the middle element is greater than both of its neighbors
            if ((mid == 0 || arr[mid] > arr[mid - 1]) && (mid == arr.length - 1 || arr[mid] > arr[mid + 1])) {
                return arr[mid]; // The middle element is the max
            }
            // Check if the middle element is less than its right neighbor
            else if (mid < arr.length - 1 && arr[mid] < arr[mid + 1]) {
                start = mid + 1; // Search in the right half of the array
            }
            // Check if the middle element is less than its left neighbor
            else if (mid > 0 && arr[mid] < arr[mid - 1]) {
                end = mid - 1; // Search in the left half of the array
            }
        }
        return -1; // The array is not sorted or has no max element
    }

    // A main function to test the findMax function
    public static void main(String[] args) {
        // Create an array of integers
        int[] arr = {1, 3, 5, 7};

        // Call the findMax function and store the result
        int max = findMax(arr);

        // Print the result
        System.out.println("The max element in the array is: " + max);
    }

}
