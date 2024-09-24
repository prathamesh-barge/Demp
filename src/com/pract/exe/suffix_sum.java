package com.pract.exe;

public class suffix_sum {
    static int[] suffixsum(int a[]){
        int  n= a.length;
        for (int i=n-2;i>=0;i--){
            a[i]=a[i]+a[i+1];
        }
        return a;

    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
      int  suffix[] = suffixsum(a);
       for (int e:suffix){
           System.out.print(e + " ");
       }

    }
}
