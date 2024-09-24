package com.pract.exe;

import java.io.*;

class Students{
    String name;
    int age;
    float marks;

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", marks=" + marks +
                '}';
    }

    public Students(String name, int age, float marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public Students() {

    }


}
public class DataWriteReadDemo {
    public static void main(String[] args) throws Exception{
         FileOutputStream fw=new FileOutputStream("out.txt");
     PrintStream ps =new PrintStream(fw);

     Students s1= new Students("vijay",21,67);
     Students s3= new Students("ajay",21,47);
     Students s2= new Students("sanjay",21,61);

     ps.println(s1);
     ps.println(s2);
     ps.println(s3);

        System.out.println("writing complete successfully");


        FileReader fr =new FileReader("out.txt");
        BufferedReader br =new BufferedReader(fr);
         String string ;
         while ((string=br.readLine())!=null)
         {
             System.out.println(string);
         }


    }


}
