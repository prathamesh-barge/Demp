package com.pract.exe;

public class removeOccurences {

    public static void main(String[] args) {

        String s="cloudtech";
        System.out.println(removeOcc(s));

    }

    static String removeOcc(String s) {

        char arr[]=s.toCharArray();

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]=='c')
            {
                arr[i]='\0';
            }
        }


        return new String(arr);

    }
}
