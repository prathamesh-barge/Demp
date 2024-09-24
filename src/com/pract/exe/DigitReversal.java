package com.pract.exe;
import java.util.*;
public class DigitReversal {
    public static void main(String[] args) {

        System.out.println(reverseDigit(20100));

    }

    static  int  reverseDigit(int num) {

        String str = "",revsr="",substr="";
        str=str+num;


        for(int i=str.length()-1;i>=0;i--)
        {

            revsr=revsr+str.charAt(i);

        }

        for(int i=0;i<revsr.length();)
        {
            if(revsr.charAt(i)=='0')
            {
                i++;
            }
            else {

                substr=revsr.substring(i);
                break;
            }
        }

        int revNumber= Integer.parseInt(substr);
        return revNumber;

    }
}
