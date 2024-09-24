package com.pract.exe;

public class PrimeSum {
//  public static void main(String[] args) {
//      System.out.println(sumOfPrimeNo(5));
//
//    }

    public static boolean isPrime(int n)
    { if (n <= 1) return false;
        if (n == 2) return true; // 2 is the only even prime number
        if (n % 2 == 0) return false; // eliminate even numbers

        for (int i = 3; i * i <= n; i += 2) { // check only odd numbers
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static int sumOfPrimeNo(int n)
    {
        int sum=0;

        for(int i=1;i<=n;i++)
        {
            if(isPrime(i))
            {
                sum=sum+i;
            }
        }
        return sum;
    }
}
