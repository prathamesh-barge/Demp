package com.pract.exe;

public class findOccurences {
    public static void main(String[] args) {
        String s1[]={"apple","banana","apple","pear","apple","chikoo"};

        System.out.println(cntOcc(s1));
    }
    static int cntOcc(String s[])
    {
        int cnt=0;
        String s1="apple";

        for(int i=0;i<s.length;i++)
        {
            if(s[i]==s1)
            {
                cnt++;
            }

        }



        return  cnt;


    }
}
