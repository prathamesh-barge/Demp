package com.pract.exe;

public class CompleteCoins {
    public static int countCompleteStairs(int n)
    {
        int i=0;
     while(n>0&&n>i)
     {
         i++;
         n=n-i;

     }
     return i;
    }
    public static void main(String[] args) {

        int res =countCompleteStairs(19);
        System.out.println(res);
    }
}
