package com.pract.exe;

public class sort_odd_even {
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
    static void sortevenodd(int a[]){
      int   i=0,j=a.length-1;
        while (i<j){

           if (a[i]%2==1 && a[j]%2==0){
               swap(a,i,j);
               i++;
               j--;
           } else if (a[i]%2==0) {
               i++;
           } else if (a[j]%2==1) {
               j--;
           }


        }




    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        sortevenodd(a);
        display_array(a);

    }
}
