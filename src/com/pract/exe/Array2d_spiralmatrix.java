package com.pract.exe;

import java.util.Scanner;

public class Array2d_spiralmatrix {
    static void printmatrix(int a [][]){

        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

    }
    static  void spiral(int a[][],int r ,int c){
        int toprow=0,bottomrow=r-1,rightcol=c-1,leftcol=0;
        int count =0;
        while (count<r*c) {

         // toprow ---> leftcol to rightcol
             for (int j=leftcol;j<=rightcol && count<r*c;j++){

                 System.out.print(a[toprow][j]+" ");
                 count++;
             }toprow++ ;

         // rightcol--->toprow to bottomrow
            for(int i=toprow;i<=bottomrow && count<r*c;i++){
                System.out.print(a[i][rightcol]+" ");
                count++;
            }rightcol--;

         // bottomrow --->rightcol to leftcol

            for (int j=rightcol;j>=leftcol && count<r*c;j--){

                System.out.print(a[bottomrow][j]+" ");
                count++;
            }
            bottomrow--;

         // leftcol----> bottomrow to toprow
            for (int i=bottomrow;i>=toprow && count<r*c;i--){

                System.out.print(a[i][leftcol]+" ");
                count++;
            }
            leftcol++;

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
        spiral(a,r,c);
     //   System.out.println("spiral matrix is ");

    }
}
