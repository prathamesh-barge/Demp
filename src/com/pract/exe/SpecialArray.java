package com.pract.exe;

public class SpecialArray {

    public static void main(String[] args) {

        int arr []={4,3,2,7,8};
        System.out.println(isSpecialArray(arr));
    }
    static boolean isSpecialArray(int arr[])
    {
        if(arr.length==1)
        {
            return true;
        }
        for(int i=1;i< arr.length;)
        {
            if(arr[i]!=arr[i-1])
            {
                i++;
            }
            else
            {
                return false;
            }

        }


        return true;
    }


}
