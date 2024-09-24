package com.pract.exe;

import java.util.Scanner;

public class Array_2d_transpose {


    static void printmatrix(int a [][]){

        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

    }
    static void transpose(int a[][],int r1,int c1){

        int ans[][]=new int[c1][r1];// new array is of c x r length
        for (int i=0;i<c1;i++){
            for (int j=0;j<r1;j++){

                ans[i][j]=a[j][i];

            }

        }

        printmatrix(ans);

    }

    static void transpose2(int a[][],int r1,int c1){

        // new array is of c x r format
        for (int i=0;i<c1;i++){
            for (int j=i;j<r1;j++){
          int temp =a[i][j];
          a[i][j]=a[j][i];
          a[j][i]=temp;
            }

        }

        printmatrix(a);

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
        transpose2(a,r,c);
    }
}
