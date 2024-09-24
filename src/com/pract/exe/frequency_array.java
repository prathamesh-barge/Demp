package com.pract.exe;

import java.util.Scanner;

public class frequency_array {
    static int []makefreq(int a[]){
        int freq []=new int[100005];
        for (int i=0;i<a.length;i++){

            freq[a[i]]++;
        }
        return freq;
    }



    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int a[]=new int[n];

        System.out.println("enter the "+n+" elemements");
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int freq[]=makefreq(a);

        System.out.println("enter the number of query to be asked");
        int q= sc.nextInt();
        while (q>0){
            System.out.println("enter the number to br searched");
            int x = sc.nextInt();
            if (freq[x]>0){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }


            q--;
        }
    }
}
