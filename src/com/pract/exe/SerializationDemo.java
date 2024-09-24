package com.pract.exe;

import java.io.*;

class Cars implements Serializable{

    String brand;
    int speed;

    boolean isSuv;

    public Cars(String brand, int speed, boolean isSuv) {
        this.brand = brand;
        this.speed = speed;
        this.isSuv = isSuv;
    }

    public Cars(){

    }

    @Override
    public String toString() {
        return "Cars{" +
                "brand='" + brand + '\'' +
                ", speed=" + speed +
                ", isSuv=" + isSuv +
                '}';
    }
}
public class SerializationDemo  {
    public static void main(String[] args) throws  Exception{

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("out2.txt")));

        Cars carsarr[] = new Cars[3];
        carsarr[0]=new Cars("Honda",120,true);
        carsarr[1]=new Cars("Hyundai",150,true);
        carsarr[2]=new Cars("Mercedes",180,false);

        for(var x: carsarr)
        {
            oos.writeObject(x);
        }

        oos.flush();
        oos.close();

        System.out.println("writing of object completed...");

        ObjectInputStream ois =new ObjectInputStream(new FileInputStream("out2.txt"));
        Cars c ;

        try{
            while(true)
            {
                c = (Cars) ois.readObject();
                System.out.println(c.toString());

            }
        }catch (Exception io)
        {

        }finally {
            System.out.println("reading completed successfully");
            ois.close();
        }







    }
}
