package com.oop.lab2.advanced;

import java.util.ArrayList;

public class Queue {
    ArrayList<Integer> objects = new ArrayList<>();
    private int length;
    private boolean limitStat;

    public Queue() {
        limitStat = false;
    }

    public Queue(int length) {
        this.length = length;
        limitStat = true;
    }

    public void pushElement(int item) {
        if (limitStat && isFull()) {
            System.out.println("Queue is full!");
        } else {
            objects.add(item);
        }
    }

  /*  public void extractLast() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
        } else {
            objects.remove(getLastElement());
            System.out.println("");
        }
    }*/

    public void popElement() {
        if (objects.size() == 0) {
            System.out.println("There is nothing to remove");
        } else {
            objects.remove(0);
        }
    }

    public void printLength() {
        if (limitStat) {
            System.out.println("Queue length is: " + length);
        } else {
            System.out.println("Queue has no defined length");
        }
    }

    public  boolean isFull() {
        if(limitStat) {
            return (length == objects.size());
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public int getLastElement() {
        return objects.get(objects.size() - 1);
    }

    public void printQueue() {
        for(int i : objects) {
            System.out.println(i);
        }
    }
}