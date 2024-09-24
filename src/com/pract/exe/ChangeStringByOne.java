package com.pract.exe;

public class ChangeStringByOne {
    public static void main(String[] args) {

        String s1="Prathamesh Barge";

        System.out.println(incBy1(s1)); //bdf
        System.out.println(cntVowel(s1)); //bdf


    }
    static String incBy1(String s1) // ace
    {
        String incStr="";
        char c;
        for(int i=0;i<s1.length();i++)
        {

            c=s1.charAt(i);
            c++;

            incStr=incStr+c;


        }

        return  incStr;
    }
    static int cntVowel(String s1)
    {
        int cnt=0;

        for(int i=0;i<s1.length();i++)
        {
            char ch=s1.charAt(i);
            if(isVowel(ch))
            {
                cnt++;
            }

        }

        return cnt;
    }

    static boolean isVowel(char ch)
    {
        char c = ch;
        c = Character.toLowerCase(c);

        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';

    }
}
