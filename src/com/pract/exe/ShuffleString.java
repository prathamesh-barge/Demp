package com.pract.exe;

public class ShuffleString {
    public static void main(String[] args) {

        String s ="codeleet";
        int indices[]={4,5,6,7,0,2,1,3};

        System.out.println(restoreString(s,indices));

    }

    public static String restoreString(String s, int[] indices) {

        char ch[] =s.toCharArray();
        char res[]= new char[indices.length];

        for(int i=0;i<res.length;i++)
        {
            res[indices[i]] = ch[i];
        }

        return new String(res);
    }
}
