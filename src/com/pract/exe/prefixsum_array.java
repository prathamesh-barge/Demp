package com.pract.exe;

import java.util.Scanner;

public class prefixsum_array {
    static void display_array(int a[]){
        for (int e:a){
            System.out.print(e+" ");;
        }

    }
    static int[]  makeprefixsum(int a[]){
        int n =a.length;
        int pref[]=new int[n];
        pref[0]=a[0];
        for (int i=1;i<n;i++){

            pref[i]=pref[i-1]+a[i];

        }
   return pref;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the "+n+" elements");
       for (int i=0;i<n;i++){
           a[i]=sc.nextInt();
       }
        int pref[]=makeprefixsum(a);
        display_array(pref);
    }
}
