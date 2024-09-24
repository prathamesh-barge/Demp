package com.pract.exe;

public class mountain_arraysearch {
    public static int mountpeaksearch(int a[],int start,int end){
                  //4 5 6 7 3 2 1
        int ans =-1;
    while (start<=end){
        int mid = start + (end - start) / 2;
        // if in uphill condition
         if( a[mid]<a[mid+1]) {
             ans =mid+1;
            start=mid+1;
            // if mid is in downhill
        } else  {
            end=mid-1;
        }


    }


        return a[ans];
    }
    public static void main(String[] args) {
    int a[]={4,5,3,2,1};
    int ans =mountpeaksearch(a,0,a.length-1);
        System.out.println(ans);
    }
}
