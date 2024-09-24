package com.pract.exe;

public class SUM_OF_ARRAY {
    public static void main(String[] args) {
        int arr[]={3,3,3,3};
        System.out.println(sum_of_array(arr));

    }

    static int sum_of_array(int arr[]){

        int sum=0;
        for (int i=0;i<= arr.length-1;i++){
            sum += arr[i];

        }
        return sum;
    }
}
