package com.pract.exe;

public class BS_1_maximum_minima {
    static boolean ifpossible(int a[],int m,int maxchoclate){

        int nos=1;
        int choc=0; // chocolate with current student
        for (int i=0;i<a.length;i++){

            if (a[i]>maxchoclate){
                return false;
            }
            if (choc+a[i]<=maxchoclate){
                choc+=a[i];
            }else {
                nos++;
                choc=a[i];
            }

        }

   return nos<=m;
    }
    static int distribute(int a[],int m){
        int ans=-1,start=0,end=(int)1e9;
        while (start<=end){
         int mid=start+(end-start);
            if (ifpossible(a, m, mid)) {

                ans=mid;
                end=mid-1;

            }else {

                start=mid+1;
            }
        }

return ans;
    }
    public static void main(String[] args) {
        int a[]={5,3,1,4,2};
        int m=3;
        System.out.println(distribute(a,m));
    }

}
