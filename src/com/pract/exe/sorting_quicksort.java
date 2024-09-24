package com.pract.exe;

public class sorting_quicksort {
    static int partion(int a[],int low, int high){
        int pivot =a[high];
        int i =low-1;
        for (int j=low;j<high;j++){

            if(a[j]<pivot){
                i++;
                int temp =a[i];
                a[i]=a[j];
                a[j]=temp;

            }
        }
     i++;
        int temp =a[i];//----> always swapa a[i] with a[high]
        a[i]=a[high];
        a[high]=temp;
        return i;
    }
    static void quicksort(int a[],int low,int high){
        if (low<=high) {
            int pidx = partion(a,low, high);

            quicksort(a, low, pidx - 1);
            quicksort(a, pidx + 1, high);
        }

    }
    public static void main(String[] args) {
        int a[]={3,2,1,7,6};
        quicksort(a,0,a.length-1);
        for (int e:a){
            System.out.print(e+" ");
        }

    }
}
