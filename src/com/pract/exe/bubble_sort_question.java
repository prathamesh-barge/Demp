package com.pract.exe;
//0 5 0 3 42 ----> input
//5 3 42 0 0-----> output
public class bubble_sort_question {
    static void  bubblesort(int a[]){
        int n= a.length;
        for (int i=0;i<n-1;i++){

            for (int j=0;j<n-i-1;j++){

                if(a[j]==0 && a[j]<a[j+1]){

                    int temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;

                }

            }

        }


    }
    public static void main(String[] args) {
        int a[]={0,5,0,0,0};
        bubblesort(a);
        for (int e : a){
            System.out.print(e+" ");
        }

    }
}
