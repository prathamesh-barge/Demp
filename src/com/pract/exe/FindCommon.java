package com.pract.exe;

import java.util.HashMap;
import java.util.HashSet;

public class FindCommon {
    public static void main(String[] args) {

        int nums1[]={2,3,2};
        int nums2[]={1,2};

        int res[]=new int[2];
        res=findIntersectionValues(nums1,nums2);
       for(var x : res)
       {
           System.out.print(x+" ");
       }
    }

    public static int[] findIntersectionValues(int[] nums1, int[] nums2)
    {
        int res[]= new int[2];
        int cnt1=0;
        int cnt2=0;

        HashSet<Integer> a1hs =new HashSet<>();
        HashSet<Integer> a2hs =new HashSet<>();

        for(int i=0; i<nums1.length;i++)
        {
            a1hs.add(nums1[i]);
        }

        for(int i=0; i<nums2.length;i++)
        {
            a2hs.add(nums2[i]);
        }

        for(int i=0;i<nums1.length;i++)
        {
            if(a2hs.contains(nums1[i]))
            {
                cnt1++;
            }

        }

        for(int i=0;i<nums2.length;i++)
        {
            if(a1hs.contains(nums2[i]))
            {
                cnt2++;
            }

        }

       res[0]=cnt1;
        res[1]=cnt2;




        return res;
    }
}
