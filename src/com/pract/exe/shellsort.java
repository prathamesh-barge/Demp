package com.pract.exe;

public class shellsort
{
    public static void main(String[] args)
    {
        int a[]={22,1,34,21,4,67,0};
        System.out.println(" array before sorting");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        int n =a.length;
        int gap;
        for(gap=n/2;gap>=1;gap=gap/2)
        {

            for (int j=gap;j<n;j++)
            {

                for(int i=j-gap;i>=0;i=i-gap){
                    if(a[i+gap]>a[i])
                    {
                        break;
                    }
                    else
                    {

                        int temp =a[i+gap];
                        a[i+gap]=a[i];
                        a[i]=temp;

                    }
                }
            }

        }
        System.out.println("sorted array is ");
        for (int e : a)
        {

            System.out.print(e+" ");

        }
    }
}
