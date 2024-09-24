package com.pract.exe;

import java.util.Scanner;

public class array2d_input {
    static void displayarray(int a[][]){

        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){

                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }


    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the no of row");
        int r = sc.nextInt();
        System.out.println("enter the no of cols");
        int c =sc.nextInt();
        int a[][]=new int[r][c];
        System.out.println("enter "+r*c+" elements");
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                a[i][j]= sc.nextInt();
            }
        }
        displayarray(a);

    }
}
