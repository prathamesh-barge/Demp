package com.pract.exe;

public class EvenSum {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,7,8,10};
        System.out.println(getEvenSum(arr));
    }
    static int getEvenSum(int arr[])
    {
        int sum=0;

        for(int i =0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
             sum=sum+arr[i];
            }

        }

        return  sum;
    }
}
