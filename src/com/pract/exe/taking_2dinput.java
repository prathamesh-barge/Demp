package com.pract.exe;

import java.util.Scanner;

public class taking_2dinput {
    static void displayarray(int a[][]){
        int n =a.length;
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[0].length;j++){
                System.out.print(a[i][j]);

            }
            System.out.println();
        }


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the number of rows");
        int rows= sc.nextInt();
        System.out.println("enter the number of cols");
        int cols= sc.nextInt();
        int a[][]=new int[rows][cols];
        System.out.println("enter the "+ rows*cols + "elements");
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                 a[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        displayarray(a);
    }

}
