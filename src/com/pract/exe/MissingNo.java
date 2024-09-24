package com.pract.exe;
import java.util.Arrays;

public class MissingNo {

    static int getMissing(int arr[])
    {

        int n=10;
        int sum =(n*(n+1))/2;

        int actSum=0;
        for(var x : arr)
        {
            actSum=actSum+x;
        }


        return sum-actSum;

    }

    public static void main(String[] args) {

        int arr[]={1,2,3,4,5,6,7,8,10};
        System.out.println(getMissing(arr));
    }

    static int findMissing(int arr[]) {
        int temp[] = new int[arr.length];

        for (int i = 0; i < temp.length; i++) {
            temp[i] = arr[i];

        }

        Arrays.sort(temp);

        for (int i = 1; i < temp.length; i++) {
            if (temp[i] != temp[i - 1] + 1) {
                return temp[i - 1] + 1;
            }

        }

        return -1;
    }
}
