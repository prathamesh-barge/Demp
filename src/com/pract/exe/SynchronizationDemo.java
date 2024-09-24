package com.pract.exe;


class Atm{

    synchronized void checkBalance(String name)
    {
        System.out.println(name+" checking");
        try{Thread.sleep(2000);}
        catch (Exception e){}
        System.out.print("Balance");
        System.out.println();
    }


  synchronized   public void Withdraw(String name,int amt)
    {
        System.out.println(name+" is Withdrawing  Money   RS" );
        try{Thread.sleep(2000);}
        catch (Exception e){}
        System.out.print(amt);
        System.out.println();

    }


}

class Customer extends  Thread
{

    Atm a;
    String name;
    int Amount ;
    Customer(Atm a,String name,int Amount)
    {
        this.a=a;
        this.name=name;
        this.Amount=Amount;
    }

    public void run()
    {


        a.checkBalance(name);
        a.Withdraw(name,Amount);

    }


}
public class SynchronizationDemo {

    public static void main(String[] args) {
        Atm a =new Atm();
        Customer c1 =new Customer(a,"John",3000);
        Customer c2 =new Customer(a,"Barry",1000);
        Customer c3 =new Customer(a,"Rock",2000);
        c1.start();
        c2.start();
        c3.start();
    }



}
