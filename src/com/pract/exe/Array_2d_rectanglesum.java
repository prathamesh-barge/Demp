package com.pract.exe;

import java.util.Scanner;

public class Array_2d_rectanglesum {
    static void printmatrix(int a[][]){

        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
static void prefixsum(int a[][]){
        int r =a.length;
        int c =a[0].length;
        for (int i=0;i<r;i++){
            for (int j=1;j<c;j++){
                a[i][j]+=a[i][j-1];
            }

        }
    for (int j=0;j<c;j++ ){ // fixing colomn
        for (int i =1 ;i<r;i++){
            a[i][j]+=a[i-1][j];
        }
    }

}
    static int findsum(int a[][],int l1,int r1 ,int l2, int r2) {
        //l1=starting row ,l2 =end row ,r1=starting col ,r2=ending col;
        int ans = 0;
        int sum = 0, up = 0, left = 0, leftup = 0;

        printmatrix(a);
        sum = a[l2][r2];

        if (r1 >= 1) {
            left = a[l2][r1 - 1];
        }

        if (r1 >= 1) {
            up = a[l1 - 1][r2];
        }
        if (l1 >= 1 && r1 >= 1) {
            leftup = a[l1 - 1][r1 - 1];
        }

        ans = sum - up - left + leftup;


        return ans;
    }
        public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter no of rows");
        int r = sc.nextInt();
        System.out.println("enter no of cols");
        int c = sc.nextInt();
        int a[][] =new int[r][c];
        System.out.println("enter "+r*c+" elements");
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                a[i][j]=sc.nextInt();

            }

        }
            System.out.println("{enter l1 ,r1, l2, r2 ");
            int l1 =sc.nextInt(),r1=sc.nextInt(), l2=sc.nextInt(), r2=sc.nextInt();

            System.out.println("input matrix");
            printmatrix(a);
            System.out.println("output matrix");
            System.out.println("rectangle sum "+ findsum(a,l1,r1, l2,r2));

    }
}
