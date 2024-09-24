package com.pract.exe;

public class MaxMoneyDemo {
    public static void main(String[] args) {
        System.out.println(maximizeMoney(5,10));
    }

    static int maximizeMoney(int N , int K) {
        int cnt=0;
        for(int i=1;i<=N;i=i+2)
        {
            cnt=cnt+K;
        }
        return cnt;
    }
}
