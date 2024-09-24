package com.pract.exe;

public class SpecialChar {
    public static void main(String[] args) {
        System.out.println(countSpecial("prathamesh@#$"));
    }
    static int countSpecial(String s){

        int cnt =0;
        String str="";
        for(int i=0;i<s.length();i++)
        {
            if(!Character.isDigit(s.charAt(i))&&!Character.isLetter(s.charAt(i))&&!Character.isWhitespace(s.charAt(i))){

                cnt++;

            }
            else{
                str=str+s.charAt(i);
            }
        }

        System.out.println(str);
        return cnt;
    }
}
