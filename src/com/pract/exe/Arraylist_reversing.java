package com.pract.exe;
import java.util.*;
import java.util.Collections;
public class Arraylist_reversing {


static void revarraylist(ArrayList<Integer> list){
    int i=0,j=list.size()-1;

    while (i<j){

      Integer temp = Integer.valueOf(list.get(i));
      list.set(i,list.get(j));
      list.set(j,temp);
   i++;
   j--;


    }


    System.out.println(list);
}



    public static void main(String[] args) {

        ArrayList<Integer> list =new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.set(3,13);
        System.out.println(list);
//        Collections.reverse(list);
//
//        System.out.println(list);
//        //revarraylist(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());//--->method to sort in decending
        System.out.println(list);
    }
}
