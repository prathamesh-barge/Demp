package com.pract.exe;

public class AmstrongDemo {

    public static void main(String[] args) {
        System.out.println(isAmstrong(372));
    }

    static boolean isAmstrong(int num){

        int temp=num;  // storing the value of num
        int sum=0;
        while(num>0)
        {
            int digit= num%10;
            sum=sum+((int)Math.pow(digit,3));
            num=num/10;
        }

        if(temp==sum)
        {
            return true;
        }



        return false;
    }
}
