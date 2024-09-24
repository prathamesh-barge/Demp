package com.pract.exe;

import java.util.ArrayList;
import java.util.HashSet;

public class BiggestNonDuplicateSubString {
    public static void main(String[] args) {
        String str = "java";
        System.out.println(findSubString(str));
    }

    public static int findSubString(String str)
    {

        int cnt=1;
        ArrayList<Integer> l1 = new ArrayList<>();
        HashSet<Character> hs = new HashSet<>();
        for(int i=0;i<str.length()-1;i++)
        {                                       //abbca
            for(int j=i+1;j<str.length();j++)
            {
               if(str.charAt(i)!=str.charAt(j) && !hs.contains(str.charAt(j)))
               {
                   cnt++;
                   hs.add(str.charAt(j));
               }
               else
               {
                     break;
               }

            }
            l1.add(cnt);
            cnt=1;
            hs.clear();


        }

        int max=Integer.MIN_VALUE;
        for(var x: l1)
        {
            if(x>max)
            {
              max=x;
            }
        }

        return max;
    }
}
