package com.pract.exe;

public class LuckyPrime {
    public static void main(String[] args) {

        findLucky(15,16);


    }

    static void findLucky(int stInd,int endInd)
    {
        int cnt=0;
        for(int i=stInd;i<=endInd;i++)
        {
            if(isPrime(i))
            {
                if(singleDigitSum(i)==5)
                {
                    cnt++;
                }
            }


        }

        if(cnt==0)
        {
            System.out.println("UNLUCKY");
        }else {
            System.out.println("Lucky\t"+cnt);
        }

    }
    static int findSum(int n) // helper method to find sum
    {
        int sum=0;
        while(n>0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        return sum;
    }


    static int singleDigitSum(int n)// helper method to find single digit sum
    {
        while(n>9)
        {
            n=findSum(n);
        }

        return n;
    }

    public static boolean isPrime(int n)
    {
        if(n==2)
        {
            return true;
        }
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
}
