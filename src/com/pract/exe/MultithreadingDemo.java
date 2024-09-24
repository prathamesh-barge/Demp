package com.pract.exe;

// process of doing multiple tast simultaneously by multiple threads is called multithreading
class Write implements Runnable{


    @Override
    public void run() {
        while(true) {
            System.out.println("i am writing ");
        }
    }
}


class Read implements Runnable{


    @Override
    public void run() {
        while(true) {
            System.out.println("i am reading ");
        }
    }
}
public class MultithreadingDemo {

    public static void main(String[] args) {
        Write write= new Write();
        Read read =new Read();

        Thread task1 = new Thread(write);
        Thread task2 = new Thread(read);
        task1.start();
        task2.start();
    }
}
