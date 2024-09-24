package com.pract.exe;

import java.util.HashMap;
import java.util.Map;

public class findFrequency {
    public static void main(String[] args) {

        int arr[]={11,11,12,12,12,1,2,3};

    }

    static void   countFreq(int arr[])
    {

        Map<Integer,Integer> hm = new HashMap<>();

        for(int i=0;i< arr.length;i++)
        {
            if(!hm.containsKey(arr[i]))
            {
                hm.put(arr[i],1);
            }else{

                hm.put(arr[i],(hm.get(arr[i])+1));
            }


        }

        for(Map.Entry<Integer,Integer> x:hm.entrySet()){

            System.out.println(x.getKey()+"="+x.getValue());

        }



    }

}
