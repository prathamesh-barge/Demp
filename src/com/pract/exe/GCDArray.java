package com.pract.exe;

import java.util.Arrays;

public class GCDArray {
    public static void main(String[] args) {
       int  N = 3, arr[] = {2, 4, 6};

        int hcf=gcd(N,arr);
        System.out.println(hcf);

    }
    public static int gcd(int N , int arr[])
    {
        if(arr.length==1)
        {
            return arr[0];
        }
        Arrays.sort(arr);
        int min =Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++)
        {
            if(Math.abs(arr[i]-arr[i+1])<min)
            {
                if(Math.abs(arr[i]-arr[i+1])==0)
                {
                    return 1;
                }
                min=Math.abs(arr[i]-arr[i+1]);
            }

        }

        for(int i=0;i<arr.length;)
        {
            if(arr[i]%min==0)
            {
                i++;
            }
            else {

                i=0;
                min=min-1;
            }

        }

        return min;
    }
}
