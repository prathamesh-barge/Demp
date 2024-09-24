package com.pract.exe;

public class reversing_array {
    static void swap(int a[],int i,int j){
        int temp =a[i];
        a[i]=a[j];
        a[j]=temp;



    }
static void arrayrev(int a[]){
        int i=0;
        int j=a.length-1;
        while (i<j){
            swap(a,i,j);
            i++;
            j--;

        }

        for (int e:a){
            System.out.print(e+" ");
        }
    }




    public static void main(String[] args) {
    int a[]={1,2,3,4,5};
    arrayrev(a);

    }
}
