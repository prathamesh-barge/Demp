package com.pract.exe;

public class BS_findpivot { static int findpivot(int arr[]){

    int start=0;
    int end=arr.length-1;
    while (start<=end){
        int mid =start+(end-start)/2;

        if (mid<end && arr[mid]>arr[mid+1]){
            return arr[mid];
        }
        if (mid>start && arr[mid-1]>arr[mid]){
            return arr[mid-1];
        }if (arr[start]<=arr[mid]){ // search from start element till middle element
            start=mid+1;
        }else {
            end=mid-1;
        }

    }

    return -1;
}


    public static void main(String[] args) {
        int a[]={4,5,6,1,2,3};
        System.out.println(findpivot(a));
    }

}
