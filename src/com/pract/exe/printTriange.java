package com.pract.exe;

public class printTriange {
    public static void main(String[] args) {

//        pStarPatter(5);
//        pStarInv(4);
        //numStar(5);
        //
        //rightStarpattern(5);
        invRightTriangle(5);
    }
    static void pStarPatter(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static void pStarInv(int n)
    {
        for(int i=n;i>0;i--)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void numStar(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(j+1+"  ");
            }
            System.out.println();
        }

    }

    static void rightStarpattern(int n)
    {

        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>i;j--) {

                System.out.print(" ");

            }
            for(int k=0;k<i;k++)
            {
                System.out.print("*");
            }

            System.out.println();
        }

        for(int i=1;i<=n-1;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }

            for (int k=n-1;k>=i;k--)
            {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    static  void  invRightTriangle(int n)
    {
        for(int i=1;i<=n;i++)
        {

            for(int j=0;j<i;j++)
            {
                System.out.print(" ");

            }


           for(int k=n;k>=i;k--)
           {
               System.out.print("*");
           }
            System.out.println();
        }


    }

}
