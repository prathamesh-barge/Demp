package com.pract.exe;

import java.util.Arrays;

public class BS_2_searching_IN_2D_ARRAY {
    static int[] find(int[][] a, int target) {
        int row = a.length;
        int cols=a[0].length;

        int i=0; // first index of row
        int j=cols-1; // last index of cols

        while (i<row  && j>=0){

            if (target==a[i][j]){

                return new int[]{i,j};
            } else if (target<a[i][j]) {
                j--;

            }else if (target>a[i][j]) {
                i++;

            }


        }







        return  new int[]{-1,-1};

    }





    public static void main(String[] args) {
        int a[][]={{1,2,3}, {4,5,6}};
        int target=6;
        System.out.println(Arrays.toString(find(a,target)));
    }
}
