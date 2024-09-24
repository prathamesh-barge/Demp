package com.pract.exe;

public class BS_5_find_minimum_element {
    // A method that returns the minimum value in an array using binary search
    public static int findMin(int[] arr) {
        // Check if the array is null or empty
        if (arr == null || arr.length == 0) {
            return -1; // Return -1 to indicate an invalid input
        }
        // Initialize the start and end pointers
        int start = 0;
        int end = arr.length - 1;
        // Loop until the start pointer is less than or equal to the end pointer
        while (start <= end) {
            // Calculate the middle index
            int mid = start + (end - start) / 2;
            // Check if the middle element is the minimum value
            if (mid == 0 || arr[mid] < arr[mid - 1]) {
                return arr[mid]; // Return the minimum value
            }
            // Check if the minimum value is in the start half of the array
            else if (arr[mid] < arr[end]) {
                end = mid - 1; // Move the end pointer to the start of the middle element
            }
            // Check if the minimum value is in the end half of the array
            else {
                start = mid + 1; // Move the start pointer to the end of the middle element
            }
        }
        return -1; // Return -1 to indicate that no minimum value was found
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println(findMin(arr));

    }

}
