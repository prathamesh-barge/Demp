package com.pract.exe;

abstract class CarInfo{

    CarInfo()
    {
        System.out.println("constructor of carInfo");
    }
    CarInfo(int val){
        this();
        System.out.println(val+" is the value");
    }

    abstract public void start();

}

class Maruti extends CarInfo
{
    Maruti(){
        super(78);

        System.out.println("cunstructor of Maruti");
    }

    Maruti(int x)
    {
        this();

        System.out.println("cunstructor of "+x);

    }

    @Override
    public void start() {
        System.out.println("Maruti car is starting ");
    }

    Maruti(int x,int y)
    {

        this(21);
        System.out.println("cunstructor2 of "+x+" "+y);

    }


}
public class ConstructorDemo {
    public static void main(String[] args) {
        CarInfo ci = new Maruti();
    }
}
