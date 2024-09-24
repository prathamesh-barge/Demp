package com.pract.exe;
class Operations
{

    public  static double divide(double a, double b){

        return a/b;


    }


}
public class ExceptionHandlingDemo {

    public static void main(String[] args) {
        Operations op = new Operations();
        double ans =op.divide(17,0);
        System.out.println(ans);

    }
}
