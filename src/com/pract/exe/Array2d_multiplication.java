package com.pract.exe;

import java.util.Scanner;

// note for multiplication c1=r2
// result of multiplication  r1 x c2
public class Array2d_multiplication {

        static void displayarray(int a[][]) {

            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {

                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }


        }

        static void multiplty(int a[][], int r1, int c1, int b[][], int r2, int c2) {

            if (c1 != r2) {
                System.out.println("multiplication not possible");
                return;
            }
            int multiply[][] = new int[r1][c2];

            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {

                    for (int k = 0; k < c1; k++) {
                        multiply[i][j] += a[i][k] * b[k][j];
                    }

                }

            }
            displayarray(multiply);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the no of row");
            int r1 = sc.nextInt();
            System.out.println("enter the no of cols");
            int c1 = sc.nextInt();
            int a[][] = new int[r1][c1];
            System.out.println("enter " + r1 * c1 + " elements");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    a[i][j] = sc.nextInt();
                }
            }


            System.out.println("enter the no of row");
            int r2 = sc.nextInt();
            System.out.println("enter the no of cols");
            int c2 = sc.nextInt();
            int b[][] = new int[r2][c2];
            System.out.println("enter " + r2 * c2 + " elements");
            for (int i = 0; i < r2; i++) {
                for (int j = 0; j < c2; j++) {
                    b[i][j] = sc.nextInt();
                }
            }
            multiplty(a, r1, c1, b, r2, c2);

        }

    }

