package com.pract.exe;
public class two_sum_Array {
    static void getind(int arr[],int target){

        for(int i=0;i<arr.length;i++) // first number tracking
        {
            for(int j=i+1;j<arr.length;j++) // always ahead i  for every i j will run respective no times
            {
                if(arr[i]+arr[j]==target) // conditional statement  if sum of values the target
                {
                        System.out.println("index i is "+i+" and j is  "+j); // here are index
                        return;
                }

            }

        }


    }
    public static void main(String[] args) {

        int arr[]={1,2,4,8,16};
        int target = 17;
        getind(arr,target);

    }
}
