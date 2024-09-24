package com.pract.exe;

import java.util.Scanner;

public class prefixsum_ {
    static void display_array(int a[]){
        for (int e:a){
            System.out.print(e+" ");;
        }

    }
    static void sum(int a[]){

        for (int i=1;i< a.length;i++){

            a[i]=a[i-1]+a[i];

        }

        display_array(a);
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
        sum(a);

    }
}
