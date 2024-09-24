package com.pract.exe;

public class bs_4_max_element {
static int findmax(int arr[]){
   if(arr==null||arr.length==0){
       return  -1;
   }
   if(arr.length==1){
       return arr[0];
   }
   int start=0;
   int end=arr.length-1;
   while (start<=end){
    int mid=start+(end-start)/2;

    if((mid==0 || arr[mid]>arr[mid+1]) && (mid==arr.length-1 || arr[mid]>arr[mid-1])){
        return arr[mid];
    }else if(mid<arr.length-1&&arr[mid]<arr[mid+1]){
        start=mid+1;

    } else if (mid>0 &&arr[mid]<arr[mid-1]) {
        end=mid-1;

    }


   }

    return -1;
}

    public static void main(String[] args) {
    int arr[]={1,2,3,4,1};
        System.out.println(findmax(arr));

    }

}
