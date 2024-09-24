package com.pract.exe;

import java.util.ArrayList;

public class jumpingNoDemo {
    public static void main(String[] args) {

        System.out.println(1000);
    }
    static long jumpingNums(long X)
    {
        for(long i=X;i>=0;i--)
        {
            if(isJumpingNo(i)){
                return i;
            }
        }
            return 0;
    }

    static boolean isJumpingNo(long X)
    {
        int digit[]=getarr(X);
        for(int i=1;i<digit.length;i++)
        {
            int diff =Math.abs(digit[i]-digit[i-1]);
            if(diff!=1)
            {
                return false;
            }
        }

        return true;

    }
    static  int []getarr(long num)
    {
        String strnum= Long.toString(num);
        int digits[]=new int[strnum.length()];
        for(int i=0;i<strnum.length();i++)
        {
            digits[i]=strnum.charAt(i)-'0';
        }

        return digits;

    }
}
