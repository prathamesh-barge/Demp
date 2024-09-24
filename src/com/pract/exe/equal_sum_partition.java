package com.pract.exe;

public class equal_sum_partition {
    static void displayarray(int a[]){
        for (int e: a){
            System.out.print(e+" ");
        }
    }
    static int sumarray(int a[]){
        int sumarray=0;
        for (int i=0;i<a.length;i++){
            sumarray+=a[i];
        }
        return sumarray;
    }
    static boolean equalsumpartion(int a[]){
        int totalsumarray=sumarray(a);
        int prefixsum=0;
        for (int i=0;i<a.length;i++){
            prefixsum =prefixsum+a[i];
            int suffixsum=totalsumarray-prefixsum;
            if (prefixsum==suffixsum){
                return true;
            }


        }


return  false;
    }
    public static void main(String[] args) {
        int a[]={1,1,1,1,1,1};
        System.out.println(equalsumpartion(a));


    }
}
