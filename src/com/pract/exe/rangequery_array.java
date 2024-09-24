package com.pract.exe;

import java.util.Scanner;

public class rangequery_array {
    static int[] prefsum(int a[]){

        for (int i=1;i< a.length;i++){

            a[i]=a[i-1]+a[i]; // main logic start loop from 1

        }
return a;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int a[]=new int[n+1];
        System.out.println("enter the "+n+" elements");
        for (int i=1;i<=n;i++){
            a[i]=sc.nextInt();
        }
        int pref[]=prefsum(a);
        System.out.println("enter the number of query");

        int q = sc.nextInt();

      while (q-->0){
          System.out.println("enter the range");
          int l = sc.nextByte();
          int r = sc.nextInt();
          int ans = pref[r]-pref[l-1];
          System.out.println(ans);
      }
    }
}
