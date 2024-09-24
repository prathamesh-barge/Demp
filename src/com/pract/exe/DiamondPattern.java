package com.pract.exe;

public class DiamondPattern {
    public static void main(String[] args) {

        printDiamond(5);
    }

    static  void  printDiamond(int n)
    {

        for(int i=1;i<=n;i++)
        {

            for(int j=1;j<=(n-i);j++)
            {
                System.out.print(" ");
            }

            for(int k=1;k<=(i*2-1);k++)
            {
                System.out.print(k);
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--)
        {

            for(int j=1;j<=(n-i);j++)
            {
                System.out.print(" ");
            }

            for(int k=1;k<=(i*2-1);k++)
            {
                System.out.print(k);
            }
            System.out.println();
        }



    }
}
