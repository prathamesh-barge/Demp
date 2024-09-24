package com.pract.exe;

public class BS_9_simple_BINARAYSEARCH
{
    public static void main(String[] args) {
      //  int target=14;
        int a[]={12,13,14,15,16};
        System.out.println(binaray_search(a[0],a[a.length-1],a,12));
       // System.out.println(findpivot(a));
       //System.out.println(search(a,target));
       // System.out.println(search(a,13));
        //System.out.println(a[a.length-1]);
    }
    static int binaray_search(int start ,int end ,int arr[],int target) {

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = start + 1;
            } else
                return mid;
        }
        return -1;
    }

    static int findpivot(int arr[]){

        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid =start+(end-start)/2;

            if (mid<end && arr[mid]>arr[mid+1]){
                return arr[mid];
            }
            if (mid>start && arr[mid-1]>arr[mid]){
                return arr[mid-1];
            }if (arr[start]<=arr[mid]){ // search from start element till middle element
                start=mid+1;
            }else {
                end=mid-1;
            }

        }

        return -1;
}
   static int search(int arr[], int target){
        int pivot=findpivot(arr);
        if (target==pivot){
            return pivot;
        }
        if (target>=arr[0] && target<pivot){
          return    binaray_search(arr[0],pivot,arr,target);
        } else if (target>pivot && target<arr[arr.length-1]) {
          return   binaray_search(pivot,arr[arr.length-1],arr,target);
        }

       return -1;
   }



}
