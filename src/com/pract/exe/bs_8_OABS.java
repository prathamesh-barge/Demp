package com.pract.exe;

public class bs_8_OABS {

    static int ORBS(int a[],int t){
        int start=0,end=a.length-1;
        boolean isscending=a[start]<a[end];
        while (start<=end){
            int mid = start + (end - start) / 2;
            if (a[mid]==t){
                return mid;
            }
        if (isscending) {

            if(a[mid]>t){
                end=mid-1;
            }else {
                start=mid+1;
            }
        }else {
             if (a[mid]>t){
                start=mid+1;

            }else {
                end=mid-1;
            }

        }

        }
        return -1;
    }
    public static void main(String[] args) {
        int a[]={1,2,3};
        System.out.println(ORBS(a,3));


    }
}
