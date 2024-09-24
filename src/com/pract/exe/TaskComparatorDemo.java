package com.pract.exe;

import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;


class Task {
    private String name;
    private int cpu;
    private int memory;
    private int thread;

    public Task(String name, int cpu, int memory, int thread) {
        this.name = name;
        this.cpu = cpu;
        this.memory = memory;
        this.thread = thread;
    }

    public String getName() {
        return name;
    }

    public int getCpu() {
        return cpu;
    }

    public int getMemory() {
        return memory;
    }

    public int getThread() {
        return thread;
    }

    @Override
    public String toString() {
        return "Task{name='" + name + "', cpu=" + cpu + ", memory=" + memory + ", thread=" + thread + '}';
    }
}

class TaskComparator implements Comparator<Task>
{

    public int compare(Task t1,Task t2)
    {
        int cpuCom =Integer.compare(t2.getCpu(),t1.getCpu());
        if(cpuCom!=0)
        {
            return cpuCom;
        }

        int memoryCom=Integer.compare(t2.getMemory(),t1.getMemory());
        if(memoryCom!=0)
        {
            return memoryCom;
        }

        int  threadCom =Integer.compare(t2.getThread(),t1.getThread());
        if(threadCom!=0)
        {
            return  threadCom;
        }

        return t1.getName().compareTo(t2.getName());
    }



}
public class TaskComparatorDemo {
    public static void main(String[] args) {

        ArrayList<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Task A", 5, 1700, 13));
        tasks.add(new Task("Task B", 5, 13, 150));
        tasks.add(new Task("Task C", 25, 235, 2));

        Collections.sort(tasks,new TaskComparator());
        for(var x : tasks)
        {
            System.out.println(x);
        }
    }
}
