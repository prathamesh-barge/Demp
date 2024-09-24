package com.pract.exe;

/*

Given an integer N and string S. your task is to find and return new String which consist of the original string repeated N times.

Input: N = 3, S = "abc"
Output: "abcabcabc"

*/


public class RepeatStringsDemo {
    public static void main(String[] args) {

        String str ="PrathameshBarge";
        String res = repeatString(3,str);
        System.out.println(res);
    }
    static String repeatString(int n,String str)
    {
        String newStr ="";
        for(int i=0;i<n;i++)
        {
            newStr=newStr+str;
        }

        return newStr;
    }
}
