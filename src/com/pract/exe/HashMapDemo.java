package com.pract.exe;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {

        HashMap<Character,Integer> hm = new HashMap<>();
        Set<Integer> s1 =new LinkedHashSet<>(List.of(1,2,3,45,45,78));

        Iterator itr = s1.iterator();

        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }


        char c='a';
        int i=0;
        for( i=0;i<5;)
        {

            hm.put(c,i);
            c++;
            i++;

        }

        for(Map.Entry<Character,Integer> x:hm.entrySet()){

            System.out.println(x.getKey()+" "+x.getValue());
        }
    }
}
