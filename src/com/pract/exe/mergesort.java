package com.pract.exe;

public class mergesort {
    // A method to merge two sorted subarrays
    public static void merge(int[] arr, int left, int mid, int right) {
        // Find the sizes of the subarrays
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Create temporary arrays to store the subarrays
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy the data from the original array to the temporary arrays
        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }

        // Initialize indexes for the subarrays and the merged array
        int i = 0, j = 0, k = left;

        // Merge the subarrays by comparing their elements
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy the remaining elements of the subarrays if any
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // A method to sort an array using merge sort
    public static void mergeSort(int[] arr, int left, int right) {
        // Check if the array has more than one element
        if (left < right) {
            // Find the middle point of the array
            int mid = (left + right) / 2;

            // Recursively sort the left and right halves of the array
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }

    public static void main(String[] args) {
        int a[]={2,1,3,6,4};
        mergeSort(a,0,a.length-1);
        for (int e : a){

            System.out.print(e+" ");
        }
    }
}
