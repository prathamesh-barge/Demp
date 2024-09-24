package com.pract.exe;

public class BS_8_MIN_ELEMENT_IN_ROTATED_SORTED_ARRAY {
    public static void main(String[] args) {
        int arr[]={4,5,6,7,1,2,3};
        System.out.println(findpivot(arr));
        System.out.println(findmin(arr));
    }

    static int findmin(int arr[]){
        int pivot=findpivot(arr);


        return arr[pivot+1];
    }

    static int findpivot(int arr[]){
        int start = 0;
        int end = arr.length - 1;
        // Loop until the start pointer is less than or equal to the end pointer
        while (start <= end) {
            // Calculate the middle index
            int mid = start + (end - start) / 2;
           if (mid<arr.length-1  &&  arr[mid]>arr[mid+1]){
               return mid;
           } if (mid>start  &&  arr[mid]<arr[mid-1]){
                return mid-1;
            }if (arr[start]<arr[mid]){
            start=mid+1;
           }else {
               end=mid-1;
            }
    }

        return -1; // Return -1 to indicate that no minimum value was found

}
}
