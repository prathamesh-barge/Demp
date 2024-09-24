package com.pract.exe;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>{

    private String name;
    private int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int compareTo(Student obj2)
    {

        return Integer.compare(obj2.getMarks(),this.getMarks());
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}

public class StudentDemo {

    public static void main(String[] args) {
        ArrayList<Student> al =new ArrayList<>();
        al.add(new Student("ABC",66));
        al.add(new Student("PQR",61));
        al.add(new Student("MNO",63));
        al.add(new Student("XYZ",64));
        al.add(new Student("EFG",62));

        Collections.sort(al);

        System.out.println(al);
    }
}
