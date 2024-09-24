package com.pract.exe;
import java.util.*;

public class array_counting_element {
    static int lastind(int a[],int x){
        int countind=-1;

        for (int i=0;i<a.length;i++){
            if (a[i]==x){
                countind=i;
            }

        }

        return countind;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int a[]={1,2,2,3,3,5,5,5,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,};
        System.out.println("enter the x ");
        int lastindex =lastind(a,3);
        System.out.println("last index is " + lastindex);
        int x=sc.nextInt();
        int count =0;
        for (int i=0;i<a.length;i++){
            if (a[i]==x){
                count++;
            }

        }
        System.out.println(x +" is present "+count+" times ");

    }

}
