package com.pract.exe;

public class array_manupulation {
    static int findunique(int a[]){

        for (int i=0;i<a.length;i++){
            for (int j=i+1;j<a.length;j++){
                if (a[i]==a[j]){

                    a[i]=Integer.MIN_VALUE;
                    a[j]=Integer.MIN_VALUE;

                }

            }


        }

        for (int i=0;i<a.length ;i++){

            if (a[i]>0){
                return a[i];
            }

        }
        return  -1;
    }
    public static void main(String[] args) {

        int a[]={1,1,2,2,3,4,4};
        int unique =findunique(a);
        System.out.println("unique single element in the array is " + unique);

    }
}
