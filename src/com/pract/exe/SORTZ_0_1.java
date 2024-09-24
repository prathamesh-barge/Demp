package com.pract.exe;

public class SORTZ_0_1 {
    static void display_array(int a[]){
        for (int e:a){
            System.out.print(e+" ");;
        }

    }
    static void swap(int a[],int i,int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
static void sort(int a[]){
        int i=0,j= a.length-1;
        while (i<=j) {

                if (a[i] ==1 && a[j]==0) {
                    swap(a, i, j);
                    i++;
                    j--;

                } else if (a[i]==0) {
                    i++;

                } else if (a[j]==1) {
                    j--;

                }


        }
        display_array(a);
}
    public static void main(String[] args) {
        int a[]={1,0,1,0,1,0,0};
        sort(a);

    }

}
