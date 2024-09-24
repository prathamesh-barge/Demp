package com.pract.exe;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class UniqueArrayValues {
    public static void main(String[] args) {

        int arr[]={1,1,2,2,3,3,4,4,5,8,6,9,10,11,5};
        findUnique(arr);
    }
    static void findUnique(int arr[])
    {
        LinkedHashSet<Integer> hs = new LinkedHashSet<>();
        Arrays.sort(arr);
        for(var x : arr)
        {
            hs.add(x);
        }

        for (var x:hs)
        {
            System.out.print(x+" ");
        }





    }
}
