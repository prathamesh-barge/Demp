package com.pract.exe;

import java.util.Random;
import java.util.Scanner;

public class palindrome {

    public static boolean ispalindrome(String x) {
        if(x.isEmpty())
        {
            System.out.println("string is empty");
            return false;
        }
        String rs = "";
        for (int j = x.length() - 1; j >= 0; j--) {
            rs = rs + x.charAt(j);

        }

        int flag = 0;
        int i = 0, j = 0;
        int end1 = x.length();
        while (i <end1 && j < end1) {

            if (x.charAt(i) == rs.charAt(j)) {
                flag = 1;
                i++;
                j++;
            } else {
                //System.out.println("NOt a palindrome");

                break;

            }

        }// end of while
        if (flag == 1) {
            System.out.println("YES ! palindrome");
            return true;
        } else
            System.out.println("NO! NOT  A PALINDROME");
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value "  );
        Integer num = sc.nextInt();
        String c =String.valueOf(num);
        System.out.println(ispalindrome(c));


    }
}

