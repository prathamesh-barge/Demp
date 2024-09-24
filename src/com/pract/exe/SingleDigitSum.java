package com.pract.exe;

public class SingleDigitSum {
    public static void main(String[] args) {
        int a =1235;
        int b= findSingleDigit(a);
        System.out.println(b);
    }
    static int findSum(int n)
    {
        int sum =0;
        while(n!=0){

            sum=sum+(n%10);
            n=n/10;

        }

        return sum;
    }

    static int findSingleDigit(int sum)
    {
        while(sum>=10)
        {
            sum = findSum(sum);
        }
        return  sum;
    }
}
