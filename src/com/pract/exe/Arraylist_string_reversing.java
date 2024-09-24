package com.pract.exe;
import java.util.*;
public class Arraylist_string_reversing {


    public static void main(String[] args) {
        ArrayList<String> l1 =new ArrayList<>();
        l1.add("prathamesh");
        l1.add("is");
        l1.add("going");
        l1.add("for");
        l1.add("mca");
        System.out.println(l1);
//      Collections.reverse(l1);
//        System.out.println(l1);
        Collections.sort(l1,Collections.reverseOrder());
        System.out.println(l1);

    }

}
