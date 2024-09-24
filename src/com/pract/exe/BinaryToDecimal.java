package com.pract.exe;

import java.util.ArrayList;

//Input: B = 10001000
//        Output: 136
public class BinaryToDecimal {
    public static void main(String[] args) {

        getDecimal("10");
    }

    static void getDecimal(String num)
    {
        ArrayList<Integer> al = new ArrayList<>();
//        while(num>0)
//        {
//            long digit = num%10;
//            al.add(digit);
//            num=num/10;
//
//        }
        //Input: B = 10001000

        for(int i=num.length()-1;i>=0;i--){

            int cngnum=num.charAt(i)-'0';

            al.add(cngnum);

        }


        int sum =0;
        for(int i=0;i<al.size();i++)
        {
            int product = (int) (Math.pow(2,i)*al.get(i));
            sum = sum+product;


        }

        System.out.println(sum);
    }

    
}
