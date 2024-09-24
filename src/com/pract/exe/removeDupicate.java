package com.pract.exe;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class removeDupicate {

    public static void main(String[] args) {
        int arr[]={1,1,2,2,3,3,4,4,6,9};
        //getDuplicates(arr);

        findduplicate(arr);
    }


    static void getDuplicates(int arr[])
    {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

        for(int i=0;i<arr.length;i++)
        {
             lhs.add(arr[i]);
        }

        for(var x : lhs)
        {
            System.out.print(x+" ");
        }
    }
   static void  findduplicate(int arr[])
   {

       for(int i=0;i<arr.length-1;i++)
       {

           for(int j=i+1;j< arr.length;j++)
           {

               if(arr[i]==arr[j])
               {
                   arr[j]=-1;
               }

           }
       }


            int i=0;
            while(i<arr.length){

                if(arr[i]!=-1)
                {
                    System.out.print(arr[i]+" ");
                }
                i++;

            }

   }



}
