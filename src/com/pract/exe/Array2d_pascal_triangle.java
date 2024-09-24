package com.pract.exe;

import java.util.Scanner;

public class Array2d_pascal_triangle
{
    static void printmatrix(int a[][]) {

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static int[][] pascal(int n) {
        int ans[][] = new int[n][];

        for (int i = 0; i < n; i++) {
            // i th row has i+1 colums in this jagged array
            ans[i] = new int [i + 1];//----> allocating new space for colom using new keyword dynamically
            // first and last element is 1
            ans[i][0] = ans[i][i] = 1;
            // as first element is already filled with 1 so j =1
            for (int j = 1; j < i; j++) {
                // here current element is sum of above element and above-1 element
                ans[i][j]=ans[i-1][j]+ans[i-1][j-1];

            }

        }
        return ans;
    }

    public static void main(String[] args) {

        int[][]print_pascal = pascal(5);
        printmatrix(print_pascal);


    }
}