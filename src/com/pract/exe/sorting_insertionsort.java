package com.pract.exe;

public class sorting_insertionsort {
    static void insertionsort(int a[]){
        int n = a.length;

        for (int i=1;i<n;i++) {

            int j = i;
            while (j > 0 && a[j] < a[j-1]) {

                int temp =a[j];
                a[j]=a[j-1];
                a[j-1]=temp;

                j--;
            }


        }
    }
    public static void main(String[] args) {
        int a[]={2,1,15,13,0};
        insertionsort(a);
        for(int  e : a){
            System.out.print(e+" ");
        }
    }
}
