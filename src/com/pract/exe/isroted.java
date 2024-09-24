package com.pract.exe;

import javax.swing.table.TableCellEditor;

public class isroted {
    public static void main(String[] args) {
        String s1= "abc";
        String s2="cab";
        System.out.println(isRoteted(s1,s2));
    }
    static boolean isRoteted(String s1,String s2)
    {

        String temp =s1+s1;

        if(temp.contains(s2))
        {
            return true;
        }
        return false;
    }
}
