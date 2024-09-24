package com.pract.exe;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {

        Map<Integer,Character> map = new HashMap<>();
        map.put(1,'a');
        map.put(2,'b');
        map.put(3,'c');
        map.put(4,'d');
        map.put(5,'e');


        Iterator<Map.Entry<Integer, Character>> itr = map.entrySet().iterator();

        while(itr.hasNext())
        {
            Map.Entry<Integer,Character> current = itr.next();
            System.out.println(current.getKey()+"->"+current.getValue());
            if(current.getValue().equals('e'))
            {
                itr.remove();

            }


        }
        System.out.println(map);

    }



}
