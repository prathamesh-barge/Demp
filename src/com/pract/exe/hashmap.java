package com.pract.exe;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

public class hashmap {

    public static  void printmap(String s){

        Map<Character,Integer> m1 =new HashMap<>();

        for (int i=0;i<s.length();i++)
        {

            Character c = s.charAt(i);

            if(m1.containsKey(c))
            {

                Integer val = m1.get(c);
                System.out.println("getting c "+m1.get(c));
                System.out.println("value is "+ val);
                val =val+1;
                m1.put(c,val);


            }
            else
            {

                m1.put(c,1);

            }



        }



    }

    public static void main(String[] args) {
        String s= "pppp";
        printmap(s);
    }

}
