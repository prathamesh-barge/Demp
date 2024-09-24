package com.pract.exe;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveOccurance {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the string ");
        String s=sc.nextLine();
        System.out.println("before removing duplicate");
        System.out.println(s);
        System.out.println("After removing duplicate");
        System.out.println(removeDuplicate(s));


    }
    static String removeDuplicate(String s)
    {
        ArrayList<Character> al = new ArrayList<>();

        for(int i=0;i<s.length();i++)
        {
            if(!al.contains(s.charAt(i)))
            {
                char ch =s.charAt(i);
                al.add(ch);

            }


        }

        StringBuilder newStr = new StringBuilder();
        for (char c : al) {
            newStr.append(c);
        }


        return newStr.toString();
    }
}
