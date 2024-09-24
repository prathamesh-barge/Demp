package com.pract.exe;

import java.util.Scanner;
// finding  at which  index does a charcter appear first and last time in a string

public class findoccurance {

    public static void findoccuranceses(String s, char x) {
        s = s.toLowerCase(); // to Avoid capital small ambiguity
        x = Character.toLowerCase(x); // to convert character to lowercase
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == x)  //
            {
                System.out.println("first occurance of " + x + " is at " + i + " index");
                break;
            }

        }// end of 1st foor loop

        for (int j = s.length() - 1; j >= 0; j--) {
            if (s.charAt(j) == x) {
                System.out.println("last occurance of " + x + " is at " + j + " index");
                return;
            }

        }//end of foor loop2

        System.out.println("charater not found/present in string ");// handling if character not found

    }// end of method


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a  string ");
        String s = sc.nextLine();
        System.out.println("enter a  character of which you want to find a occurance");
        char x = sc.next().charAt(0);
        findoccuranceses(s, x);

    }
}
