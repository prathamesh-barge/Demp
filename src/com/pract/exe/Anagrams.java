package com.pract.exe;
import java .util.HashSet;

public class Anagrams {
    public static void main(String[] args) {

        String s1="aab";
        String s2="abac";

        System.out.println(isAnagram(s1,s2));
    }
    static boolean isAnagram(String s1 , String s2)
    {
        HashSet<Character> hs= new HashSet<>();

        if(s1.length()!=s2.length())
        {
            return false;
        }
        for(int i=0;i<s1.length();i++)
        {
            hs.add(s1.charAt(i));
        }

        for(int i=0;i<s2.length();i++)
        {
            if(!hs.contains(s2.charAt(i)))
            {
                return  false;
            }
        }


        return  true;


    }
}
