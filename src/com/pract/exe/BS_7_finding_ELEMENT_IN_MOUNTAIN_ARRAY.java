package com.pract.exe;

public class BS_7_finding_ELEMENT_IN_MOUNTAIN_ARRAY {
    static int find_peak(int a[]) {
        int start = 0, end = a.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;


            if (mid == 0 || a[mid] > a[mid - 1] && a[mid] > a[mid + 1] || mid == a.length - 1) {
                return a[mid];
            } else if (a[mid] < a[mid + 1]) {
                start = mid + 1;
                //search right hand side
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    static int ORBS(int a[],int t,int start,int end){
        //int start=0,end=a.length-1;
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
    static int search(int a[],int target){
      int peak=find_peak(a);
      int tryfirst = ORBS(a,target,0,peak) ;
      if (tryfirst !=-1){
          return tryfirst;
      }

     return ORBS(a,target,peak+1,a.length-1);


    }

    public static void main(String[] args) {
        int a[] = {1,3,4,5,2,0};
        int target=5;
        //System.out.println(find(a,target));
        System.out.println(search(a,target));
    }
}