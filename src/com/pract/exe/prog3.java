package com.pract.exe;
import java.util.*;
import java.util.TreeSet;
import java.util.Comparator;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

class ComparatorAge implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        if(p1.getName()!=p2.getName())
        {
            return p1.getName().compareTo(p2.getName());
        }

       return Integer.compare(p2.getAge(),p1.getAge());
    }
}

public class prog3 {

    public static void main(String[] args) {

       List<Person> al =new ArrayList<>();
       al.add(new Person("prathamesh",22));
        al.add(new Person("sahil",19));
        al.add(new Person("raj",21));
        al.add(new Person("shreya",18));

        Collections.sort(al,new ComparatorAge());

        for(Person x : al)
        {
            System.out.println(x);
        }



    }
}
