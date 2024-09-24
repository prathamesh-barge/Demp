package com.pract.exe;

import java.util.Scanner;

public class Array2d_rotate {
    static void printmatrix(int a [][]){

        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

    }

    static void reverse(int a[]){
        int j= a.length-1,i=0;
        for ( i=0,j= a.length-1;i<a.length&&j>0;i++,j--){
            int temp =a[i];
            a[i]=a[j];
            a[j]=temp;
        }

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

    }

    static void rotate(int a[][],int n){
         transpose2(a,n,n);
         for (int i=0;i< a.length;i++) {
             reverse(a[i]);
         }
        //printmatrix(a);
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
rotate(a,r);
        System.out.println( "rotated ");
     printmatrix(a);
    }


    }

