package com.pract.exe;

public class BS_6_findmin {
    static int findmin(int a[]){
        if (a == null || a.length == 0) {
            return -1; // Return -1 to indicate an invalid input
        }
        int start=0,end=a.length-1;
        while (start<=end){
            int mid = start + (end - start) / 2;


           if(mid==0||a[mid]<a[mid-1]){
               return a[mid];
           } else if (a[mid]<a[end]) {
               end=mid-1; //search right hand side


           }else {
               start=mid+1;


           }


        }



        return -1;
    }



    public static void main(String[] args){
        int a[]={11,2,3,4};
        System.out.println(findmin(a));

    }

}
