package com.pract.exe;

public class HCF {
    public static void main(String[] args) {
        System.out.println(findHcf(1,1));
    }
    static int findHcf(int a,int b)
    {
        if(a==1 && b==1)
        {
            return 1;
        }

        int diff =Math.abs(a-b);
        if(a%diff==0 && b%diff==0)
        {
            return  diff;
        }
        else {

            for(int i=diff-1;i>0;i--)
            {
                if(a%i==0 && b%i==0)
                {
                    return  i;
                }
            }


        }

        return  -1;
    }
}
