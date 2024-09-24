package com.pract.exe;

public class rotate_array_k_times {
    static void display_array(int a[]){
        for (int e:a){
            System.out.print(e+" ");;
        }

    }
    static void swap(int a[],int i,int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    static void reverseearray(int a[],int i ,int j){

        while (i<j){
            swap(a,i,j);
            i++;
            j--;

        }

    }
    static void rotatearray(int a[],int k){
        int n=a.length;
        k=k%n;//----> array rotation = remainder of k
        // rotation of part 1
        reverseearray(a,0,n-k-1);
        // rotation of part 2
        reverseearray(a,n-k,n-1);
        //rotation of part 1 + part 2 together
        reverseearray(a,0,n-1);
        System.out.println();
        display_array(a);

    }
        public static void main(String[] args) {
        int a[]={1,2,3,4,5,9,10};
        rotatearray(a,23);

    }



}
