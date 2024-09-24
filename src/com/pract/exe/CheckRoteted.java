package com.pract.exe;

public class CheckRoteted {
    public static void main(String[] args) {
        String s1,s2;
        s1="abc";
        s2="bcax";
        System.out.println(ishaving(s1,s2));
    }
    static boolean ishaving(String s1,String s2){

        String temp =s1+s1;

        if(temp.contains(s2))
        {
            return true;
        }

        return  false;


    }
}
