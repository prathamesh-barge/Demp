package com.pract.exe;

public class LCM {
    public static void main(String[] args) {

        System.out.println(findLcm(200,1000));
    }
    static int findLcm(int a,int b)
    {
        int max=0,min=0; // check for the bigger number
        if(a>b)
        {
            max=a;
            min=b;
        }else{

            max=b;
            min=a;
        }

        int i=1;
        while(true)
        {
            int lcm =max*i;
            if(lcm%min==0)
            {
                return lcm;
            }
            i++;

        }

    }
}
