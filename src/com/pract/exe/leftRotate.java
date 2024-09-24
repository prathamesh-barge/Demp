package com.pract.exe;

public class leftRotate {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        leftRotation(arr);
    }

    static void leftRotation(int arr[])
    {

        int temp =arr[0]; //1

        for(int i=0;i< arr.length-1;i++)
        {
            arr[i]=arr[i+1]; // int 0 =2

        }
        arr[arr.length-1]=temp;

        for(var x: arr)
        {
            System.out.print(x+" ");
        }



    }
}
