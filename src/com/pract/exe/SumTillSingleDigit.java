package com.pract.exe;

public class SumTillSingleDigit {
    public static void main(String[] args) {

        int ans =repeatedSumOfDigits(12345);
        System.out.println(ans);
    }
    static int repeatedSumOfDigits(int N){

        while(N>=10)
        {

            N=getSum(N);
        }
        return N;

    }
    static int getSum(int n)
    {
        int sum =0;
        while(n>0)
        {
            int ld =n%10;
            sum=sum+ld;
            n=n/10;
        }

        return sum;
    }
}
