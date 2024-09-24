package com.pract.exe;

public class bs_7_searchinrotatedARRAY {
    public static void main(String[] args) {
 int a[]={5,6,7,4,3,2};
        System.out.println(find(a,7));
    }
    static int find(int a[],int target){
        int start=0;
        int end=a.length-1;
        while (start<=end){
           int mid=start+(end-start)/2;
           if (a[mid]==target){
               return mid;
           }
           if (a[mid]<a[end]){

              if (target>a[mid] && target<=a[end]){

                  start=mid+1;
              }else {

                  end=mid-1;
              }

           }else {

               if (target>=a[start] && target<a[mid]){
                   end=mid-1;

               }else {
                   start=mid+1;

               }
           }

        }
return -1;

    }

}
