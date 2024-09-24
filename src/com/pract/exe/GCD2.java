package com.pract.exe;

public class GCD2 {

    public static void main(String[] args) {

        System.out.println(findGCD(2,4));

    }
    public static int findGCD(int a, int b)
    {

        if(b==0)
        {
            return a;
        }

        return findGCD(b,a%b);
    }
}
