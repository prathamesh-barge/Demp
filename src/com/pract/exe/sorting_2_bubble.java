package com.pract.exe;

public class sorting_2_bubble {
    static void bubblesort(int a[]){
        int n = a.length;
        for (int i=0;i<=n-1;i++)//---> as last element is always sorted
        {
         for (int j=0;j<n-i-1;j++){

             if (a[j]>a[j+1]){

                 int temp =a[j];
                 a[j]=a[j+1];
                 a[j+1]=temp;

             }


         }

        }

    }

    public static void main(String[] args) {
        int a[]={2,1,5,13,0};
        bubblesort(a);
        for(int  e : a){
            System.out.print(e+" ");
        }
    }
}



