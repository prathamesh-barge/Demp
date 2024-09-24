package com.pract.exe;

public class PerfectSquare {

    public static void main(String[] args) {
        System.out.println(findPerfectSquare(16));

    }
    static int findPerfectSquare(int n)
    {
        int cnt=0;
        for(int i=1;i*i<n;i++)
        {
                cnt++;
        }
            return cnt;
    }
}
