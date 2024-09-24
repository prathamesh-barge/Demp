package com.pract.exe;

public class sorting_1_selectionsort {
//    static void selection_sort(int a[]){
//        int n=a.length;
//        for (int i=0;i<n-1;i++)
//        {// im represent the current index
//
//            //find minimum element in the unsorted part of the array
//            int min_ind = i;
//            for (int j=i+1;j<n;j++){
//                if (a[j]<a[min_ind]){
//                    min_ind = j;
//                }
//            }
//            // swap current element and minimum index--->current index 'i'   will have correct element
//            //a[i],a[min_ind]
//
//            int temp =a[i];
//            a[i]=a[min_ind];
//            a[min_ind]=temp;
//
//        }
//    }
    static void selection_sort(int a[]){
        int n =a.length;

        for (int i=0;i<n-1;i++ ){
            int min_ind =i;
            for (int j=i+1;j<n;j++){

                if (a[j]<a[min_ind]){
                    min_ind=j;
                }
            }
            int temp =a[i];
            a[i]=a[min_ind];
            a[min_ind]=temp;

        }
    }


    public static void main(String[] args) {
int a[]={2,1,5,3,0};
selection_sort(a);
        for(int  e : a){
            System.out.print(e+" ");
        }
    }
    }

